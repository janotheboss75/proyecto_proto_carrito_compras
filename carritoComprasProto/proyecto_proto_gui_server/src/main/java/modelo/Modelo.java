package modelo;

import entidades.Producto;
import entidades.StockProducto;
import interfaces.IModeloLeible;
import interfaces.IModeloModificable;
import interfaces.IServer;
import interfaces.Publisher;
import interfaces.Subscriber;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janot
 */
public class Modelo implements Publisher, IModeloLeible, IModeloModificable{
    //Lista de subscriptores
    private List<Subscriber> subscriberList = new ArrayList<>();
    
    //Variable bandera para mostrar pantalla inventario
    private boolean mostrarPantallaInventario = false;
    
    //Variable bandera para mostrar pantalla agregar producto
    private boolean mostrarPantallaAgregarProducto = false;
    
    //Lista de inventario
    private List<StockProducto> listaInventario = new ArrayList<>();
    
    //Conexion con el servidor
    IServer server;

    public Modelo(IServer server) {
        //Creamos los productos MOKE
        Producto p1 = new Producto("PROD-001", "Laptop Gamer", 1200.00);
        Producto p2 = new Producto("PROD-002", "Mouse Optico", 25.50);
        Producto p3 = new Producto("PROD-003", "Teclado Mecánico", 85.99);
        Producto p4 = new Producto("PROD-004", "Monitor 27 Pulgadas", 299.90);
        Producto p5 = new Producto("PROD-005", "Disco SSD 1TB", 129.75);
        
        //Creamos los stocks de productos MOKE
        StockProducto sP1 = new StockProducto(p1, 5);
        StockProducto sP2 = new StockProducto(p2, 5);
        StockProducto sP3 = new StockProducto(p3, 5);
        StockProducto sP4 = new StockProducto(p4, 5);
        StockProducto sP5 = new StockProducto(p5, 5);
        
        this.server = server;
        
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);
        server.prenderServidor();
        server.enviarProductosExistentes(listaProductos);
        
        
        //Los agregamos a la lista
        this.agregarProductoAInventario(sP1);
        this.agregarProductoAInventario(sP2);
        this.agregarProductoAInventario(sP3);
        this.agregarProductoAInventario(sP4);
        this.agregarProductoAInventario(sP5);
    }
    
    //Metodos de la interfaz IModeloLeible
    @Override
    public boolean isMostrandoPantallaInventario() {
        return mostrarPantallaInventario;
    }
    
    @Override
    public boolean isMostrandoPantallaAgregarProducto() {
        return mostrarPantallaAgregarProducto;
    }

    //Metodos de la interfaz IModeloModificable
    @Override
    public void mostrarPantallaInventario() {
        mostrarPantallaInventario = true;
        notifySubscribers();
    }

    @Override
    public void ocultarPantallaInventario() {
        mostrarPantallaInventario = false;
        notifySubscribers();
        System.exit(0);
    }

    @Override
    public void mostrarPantallaAgregarProducto() {
        mostrarPantallaAgregarProducto = true;
        notifySubscribers();
    }

    @Override
    public void ocultarPantallaAgregarProducto() {
        mostrarPantallaAgregarProducto = false;
        notifySubscribers();
    }
    
    @Override
    public void agregarProductoAInventario(StockProducto stockProducto) {
        listaInventario.add(stockProducto);
        notifySubscribers();
        if(server != null){
            server.enviarProductoAClientes(stockProducto.getProducto());
        }
        
    }

    @Override
    public List<StockProducto> obtenerInventario() {
        return listaInventario;
    }
    
    //Metodos de la interfaz Publisher
    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update();
        }
    }
}
