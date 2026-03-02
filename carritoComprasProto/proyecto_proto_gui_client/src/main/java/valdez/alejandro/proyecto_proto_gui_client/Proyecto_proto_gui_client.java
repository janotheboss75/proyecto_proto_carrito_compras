package valdez.alejandro.proyecto_proto_gui_client;

import controlador.Controlador;
import entidades.Producto;
import fachada.Cliente;
import modelo.Modelo;
import vista.CantidadProducto;
import vista.CarritoCompras;

/**
 *
 * @author janot
 */
public class Proyecto_proto_gui_client {

    public static void main(String[] args) {
        
        //Instancio modelo, controlador y la gui CarritoCompras
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo);
        CarritoCompras cC = new CarritoCompras(modelo, controlador);
        CantidadProducto cP = new CantidadProducto(cC, true, modelo, controlador);
        
        
        
        //Subscribo la gui CarritoCompras a modelo
        modelo.subscribe(cC);
        modelo.subscribe(cP);
        
        //Creamos los productos
        Producto p1 = new Producto("PROD-001", "Laptop Gamer", 1200.00);
        Producto p2 = new Producto("PROD-002", "Mouse Optico", 25.50);
        Producto p3 = new Producto("PROD-003", "Teclado Mecánico", 85.99);
        Producto p4 = new Producto("PROD-004", "Monitor 27 Pulgadas", 299.90);
        Producto p5 = new Producto("PROD-005", "Disco SSD 1TB", 129.75);
        
        modelo.agregarProducto(p1);
        modelo.agregarProducto(p2);
        modelo.agregarProducto(p3);
        modelo.agregarProducto(p4);
        modelo.agregarProducto(p5);
        
        //Muestro la GUI
        controlador.mostrarPantallaCarritoCompras();
        
        //Hago una notificacion
        modelo.notifySubscribers();
    }
}
