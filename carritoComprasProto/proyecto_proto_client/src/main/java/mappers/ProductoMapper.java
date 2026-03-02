package mappers;

import valdez.alejandro.carrito.grpc.Producto;

/**
 *
 * @author janot
 */
public class ProductoMapper {
    public static entidades.Producto toEntity(Producto proto) {
            return new entidades.Producto(
                    proto.getId(),
                    proto.getNombre(),
                    proto.getPrecio()
            );
    }
}
