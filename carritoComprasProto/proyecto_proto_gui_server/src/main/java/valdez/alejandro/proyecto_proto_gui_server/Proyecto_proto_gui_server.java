package valdez.alejandro.proyecto_proto_gui_server;

import controlador.Controlador;
import entidades.Producto;
import entidades.StockProducto;
import modelo.Modelo;
import vista.Inventario;

/**
 *
 * @author janot
 */
public class Proyecto_proto_gui_server {

    public static void main(String[] args) {
        //Inicializar Modelo, Controlador, Vista
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo);
        Inventario i = new Inventario(modelo, controlador);
        
        //Subscribimos la vista al modelo
        modelo.subscribe(i);
        
        //Creamos los productos
        Producto p1 = new Producto("PROD-001", "Laptop Gamer", 1200.00);
        Producto p2 = new Producto("PROD-002", "Mouse Optico", 25.50);
        Producto p3 = new Producto("PROD-003", "Teclado Mecánico", 85.99);
        Producto p4 = new Producto("PROD-004", "Monitor 27 Pulgadas", 299.90);
        Producto p5 = new Producto("PROD-005", "Disco SSD 1TB", 129.75);
        
        //Creamos los stocks de productos
        StockProducto sP1 = new StockProducto(p1, 5);
        StockProducto sP2 = new StockProducto(p2, 5);
        StockProducto sP3 = new StockProducto(p3, 5);
        StockProducto sP4 = new StockProducto(p4, 5);
        StockProducto sP5 = new StockProducto(p5, 5);
        
        modelo.agregarProductoAInventario(sP1);
        modelo.agregarProductoAInventario(sP2);
        modelo.agregarProductoAInventario(sP3);
        modelo.agregarProductoAInventario(sP4);
        modelo.agregarProductoAInventario(sP5);
        
        modelo.mostrarPantallaInventario();
        
    }
}
