package modelo;

import entidades.Producto;
import entidades.ProductoCarrito;
import fachada.ICliente;
import interfaces.IModeloLeible;
import interfaces.IModeloModificable;
import interfaces.Publisher;
import interfaces.Subscriber;
import interfaces.SubscriberClient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janot
 */
public class Modelo implements IModeloLeible, IModeloModificable, Publisher, SubscriberClient{
    //Lista de subscriptores de modelo
    private List<Subscriber> subscriberList = new ArrayList();
    
    //Variable flag para mostrar o no mostrar la pantalla CarritoCompras
    private boolean mostrarPantallaCarritoCompras = false;
    //Variable flag para mostrar o no mostrar la pantalla CantidadProducto
    private boolean mostrarPantallaCantidadProducto = false;
    
    
    //Datos Moke de Productos
    private List<Producto> listaProductos = new ArrayList<>();
    
    //Datos de productos de carrito
    private List<ProductoCarrito> listaProductosCarrito = new ArrayList<>();
    
    //Variable flag para productoSeleccionado;
    private Producto productoSeleccionado = null;
    
    //Conexion con cliente
    private ICliente cliente;

    public Modelo(ICliente cliente) {
        this.cliente = cliente;
        cliente.conectarConServidor();
        cliente.cargarDatosExistentes();
        cliente.subscribirAProductoService(this);
        
    }
    
    //Metodos interfaz IModeloLeible
    @Override
    public boolean isMostrandoPantallaCarritoCompras() {
        return mostrarPantallaCarritoCompras;
    }
    
    @Override
    public boolean isMostrandoPantallaCantidadProducto() {
        return mostrarPantallaCantidadProducto;
    }
    
    @Override
    public List<Producto> obtenerProductos() {
        return listaProductos;
    }
    
    @Override
    public List<ProductoCarrito> obtenerProductosDelCarrito() {
        return listaProductosCarrito;
    }

    
    @Override
    public Producto obtenerProductoSeleccionado() {
        return productoSeleccionado;
    }

    //Metodos interfaz IModeloModificable
    @Override
    public void mostrarPantallaCarritoCompras() {
        mostrarPantallaCarritoCompras = true;
        notifySubscribers();
    }
    
    @Override
    public void mostrarPantallaCantidadProducto() {
        mostrarPantallaCantidadProducto = true;
        notifySubscribers();
    }

    @Override
    public void ocultarPantallaCarritoCompras() {
       mostrarPantallaCarritoCompras = false;
       notifySubscribers();
    }

    @Override
    public void ocultarPantallaCantidadProducto() {
        mostrarPantallaCantidadProducto = false;
        notifySubscribers();
    }
    
    @Override
    public void seleccionarProducto(Producto producto) {
        productoSeleccionado = producto;
    }
    
    @Override
    public void agregarProductoAlCarrito(ProductoCarrito productoCarrito) {
        listaProductosCarrito.add(productoCarrito);
        notifySubscribers();
    }

    
    //Metodos interfaz Publisher
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
    
    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
        notifySubscribers();
    }

    @Override
    public void update(Producto productoNuevo) {
        agregarProducto(productoNuevo);
    }

}
