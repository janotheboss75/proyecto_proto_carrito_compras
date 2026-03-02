package valdez.alejandro.proyecto_proto_client;

import services.ProductoService;
/**
 *
 * @author janot
 */
public class Proyecto_proto_client {

    public static void main(String[] args) {
        ProductoService pS = new ProductoService();
        pS.escucharProductos();
    }
}
