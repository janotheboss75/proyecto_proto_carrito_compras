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
    
    public static Producto toProto(entidades.Producto productoEntity) {

        return Producto.newBuilder()
                .setId(productoEntity.getId())
                .setNombre(productoEntity.getNombre())
                .setPrecio(productoEntity.getPrecio())
                .build();
    }
}
