package mappers;

import valdez.alejandro.carrito.grpc.ProductoCarrito;

/**
 *
 * @author janot
 */
public class ProductoCarritoMapper {
    public static ProductoCarrito toProto(entidades.ProductoCarrito productoCarrito){
        return ProductoCarrito.newBuilder()
            .setProductoId(productoCarrito.getProducto().getId())
            .setCantidad(productoCarrito.getCantidad())
            .build();
    }
}


