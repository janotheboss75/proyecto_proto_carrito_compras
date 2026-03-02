package interfaces;

import java.util.List;
import valdez.alejandro.carrito.grpc.Producto;

/**
 *
 * @author janot
 */
public interface IClient {
    public List<Producto> obtenerProductos();
}
