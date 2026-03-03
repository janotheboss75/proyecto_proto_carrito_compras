package implementaciones;

import entidades.Producto;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mappers.ProductoMapper;
import valdez.alejandro.carrito.grpc.ProductoRequest;
import valdez.alejandro.carrito.grpc.ProductoResponse;
import valdez.alejandro.carrito.grpc.ProductoServiceGrpc;

/**
 *
 * @author janot
 */
public class ProductoServiceImpl extends ProductoServiceGrpc.ProductoServiceImplBase{
    
    private final List<StreamObserver<ProductoResponse>> clientes = new CopyOnWriteArrayList<>();
    
    private List<entidades.Producto> listaInventario = new ArrayList<>();

    public ProductoServiceImpl() {
    }

    @Override
    public void listarProductos(ProductoRequest request, StreamObserver<ProductoResponse> responseObserver) {
        System.out.println("Procesando productos existentes para el usuario: " + request.getUsuarioId());
        
        try {
                for (entidades.Producto producto : listaInventario) {

                    ProductoResponse response = ProductoResponse.newBuilder()
                            .setProducto(ProductoMapper.toProto(producto))
                            .build();
                    responseObserver.onNext(response);
                }

                responseObserver.onCompleted();

            } catch (Exception e) {
                responseObserver.onError(e);
            }
    }
    
    
    
    @Override
    public void escucharNuevosProductos(ProductoRequest request, StreamObserver<ProductoResponse> responseObserver){
        clientes.add(responseObserver);
        System.out.println("Cliente " + request.getUsuarioId() + " conectado al stream");
    }
    
    public void notificarNuevoProducto(entidades.Producto producto) {

        ProductoResponse response = ProductoResponse.newBuilder()
                        .setProducto(ProductoMapper.toProto(producto))
                        .build();

        for (StreamObserver<ProductoResponse> cliente : clientes) {
            try {
                cliente.onNext(response);
            } catch (Exception e) {
                clientes.remove(cliente); // remover cliente muerto
            }
        }
    }

    public void setListaInventario(List<Producto> listaInventario) {
        this.listaInventario = listaInventario;
    }
}