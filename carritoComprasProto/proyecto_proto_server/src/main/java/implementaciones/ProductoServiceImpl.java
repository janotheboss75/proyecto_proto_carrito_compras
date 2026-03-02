package implementaciones;

import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import valdez.alejandro.carrito.grpc.Producto;
import valdez.alejandro.carrito.grpc.ProductoRequest;
import valdez.alejandro.carrito.grpc.ProductoResponse;
import valdez.alejandro.carrito.grpc.ProductoServiceGrpc;

/**
 *
 * @author janot
 */
public class ProductoServiceImpl extends ProductoServiceGrpc.ProductoServiceImplBase{
    List<entidades.Producto> listaInventario = new ArrayList<>();

    public ProductoServiceImpl() {
        entidades.Producto p1 = new entidades.Producto("PROD-001", "Laptop Gamer", 1200.00);
        entidades.Producto p2 = new entidades.Producto("PROD-002", "Mouse Optico", 25.50);
        entidades.Producto p3 = new entidades.Producto("PROD-003", "Teclado Mecánico", 85.99);
        entidades.Producto p4 = new entidades.Producto("PROD-004", "Monitor 27 Pulgadas", 299.90);
        entidades.Producto p5 = new entidades.Producto("PROD-005", "Disco SSD 1TB", 129.75);
        
        listaInventario.add(p1);
        listaInventario.add(p2);
        listaInventario.add(p3);
        listaInventario.add(p4);
        listaInventario.add(p5);
    }
    
    @Override
    public void listarProductos(ProductoRequest request, StreamObserver<ProductoResponse> responseObserver) {
        System.out.println("Enviando Catalogo a " + request.getUsuarioId() + "...");
        
        ProductoResponse.Builder responseBuilder = ProductoResponse.newBuilder();
        
        for (entidades.Producto p : listaInventario) {
            Producto productoProto = Producto.newBuilder()
                    .setId(p.getId())
                    .setNombre(p.getNombre())
                    .setPrecio(p.getPrecio())
                    .build();
            
            responseBuilder.addProductos(productoProto);
        }
        
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }
    
}
