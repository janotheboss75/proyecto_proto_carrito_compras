package valdez.alejandro.proyecto_proto_gui_server;

import controlador.Controlador;
import entidades.Producto;
import entidades.StockProducto;
import fachade.Server;
import modelo.Modelo;
import vista.AgregarProducto;
import vista.Inventario;

/**
 *
 * @author janot
 */
public class Proyecto_proto_gui_server {

    public static void main(String[] args) {
        //Creando la instancia del server
        Server server = new Server();
        
        //Inicializar Modelo, Controlador, Vista
        Modelo modelo = new Modelo(server);
        Controlador controlador = new Controlador(modelo);
        Inventario i = new Inventario(modelo, controlador);
        AgregarProducto aP = new AgregarProducto(i, true, modelo, controlador);
        
        //Subscribimos la vista al modelo
        modelo.subscribe(i);
        modelo.subscribe(aP);
        
        modelo.mostrarPantallaInventario();
        
    }
}
