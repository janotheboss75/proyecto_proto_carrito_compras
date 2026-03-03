package valdez.alejandro.proyecto_proto_gui_client;

import controlador.Controlador;
import entidades.Producto;
import fachada.Cliente;
import fachada.ICliente;
import modelo.Modelo;
import vista.CantidadProducto;
import vista.CarritoCompras;
import vista.StatusPago;

/**
 *
 * @author janot
 */
public class Proyecto_proto_gui_client {

    public static void main(String[] args) {
        
        ICliente cliente = new Cliente();
        
        //Instancio modelo, controlador y la gui CarritoCompras
        Modelo modelo = new Modelo(cliente);
        Controlador controlador = new Controlador(modelo);
        CarritoCompras cC = new CarritoCompras(modelo, controlador);
        CantidadProducto cP = new CantidadProducto(cC, true, modelo, controlador);
        StatusPago stPa = new StatusPago(cC, true, modelo, controlador);
        
        //Subscribo la gui CarritoCompras a modelo
        modelo.subscribe(cC);
        modelo.subscribe(cP);
        modelo.subscribe(stPa);
        
        //Muestro la GUI
        controlador.mostrarPantallaCarritoCompras();
        
        //Hago una notificacion
        modelo.notifySubscribers();
    }
}
