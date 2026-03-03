package services;


import conexion.GrpcChannelManager;
import entidades.Producto;
import interfaces.SubscriberClient;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import mappers.ProductoMapper;
import valdez.alejandro.carrito.grpc.ProductoRequest;
import valdez.alejandro.carrito.grpc.ProductoResponse;
import valdez.alejandro.carrito.grpc.ProductoServiceGrpc;
/**
 *
 * @author janot
 */
public class ProductoService {
    private final List<SubscriberClient> subscribers = new ArrayList<>();
    
    private final ProductoServiceGrpc.ProductoServiceStub asyncStub;
    private final ProductoServiceGrpc.ProductoServiceBlockingStub blockingStub;

    public ProductoService() {
        asyncStub = ProductoServiceGrpc.newStub(GrpcChannelManager.getChannel());
        blockingStub = ProductoServiceGrpc.newBlockingStub(GrpcChannelManager.getChannel());
    }
    
    public void listarProductosExistentesEnServidor(String usuarioId){
        ProductoRequest request = ProductoRequest.newBuilder()
                    .setUsuarioId(usuarioId)
                    .build();

            asyncStub.listarProductos(request, new StreamObserver<ProductoResponse>() {

                @Override
                public void onNext(ProductoResponse response) {
                    entidades.Producto producto = ProductoMapper.toEntity(response.getProducto());
                    notifySubscribers(producto);
                }

                @Override
                public void onError(Throwable t) {}

                @Override
                public void onCompleted() {
                    System.out.println("Carga inicial completa");
                }
            });
    }

    public void escucharProductos(String usuarioId) {

        ProductoRequest request = ProductoRequest.newBuilder()
                .setUsuarioId(usuarioId)
                .build();

        asyncStub.escucharNuevosProductos(request,
                new StreamObserver<ProductoResponse>() {

                    @Override
                    public void onNext(ProductoResponse response) {

                        entidades.Producto producto =
                                ProductoMapper.toEntity(response.getProducto());
                        System.out.println(producto.getNombre());
                        notifySubscribers(producto);
                    }

                    @Override
                    public void onError(Throwable t) {
                        System.out.println("Error en stream: " + t.getMessage());
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Servidor cerró conexión");
                    }
                });
    }

    // 🔹 Observer pattern para el MVC
    public void subscribe(SubscriberClient subscriber) {
        subscribers.add(subscriber);
    }

    private void notifySubscribers(entidades.Producto producto) {
        for (SubscriberClient s : subscribers) {
            s.update(producto);
        }
    }
}