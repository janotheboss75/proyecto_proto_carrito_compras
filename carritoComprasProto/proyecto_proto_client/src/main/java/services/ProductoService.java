package services;

import conexion.GrpcChannelManager;
import interfaces.PublisherClient;
import interfaces.SubscriberClient;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import mappers.ProductoMapper;
import valdez.alejandro.carrito.grpc.Producto;
import valdez.alejandro.carrito.grpc.ProductoRequest;
import valdez.alejandro.carrito.grpc.ProductoResponse;
import valdez.alejandro.carrito.grpc.ProductoServiceGrpc;

/**
 *
 * @author janot
 */
public class ProductoService implements PublisherClient{
    List <SubscriberClient> subscriberList = new ArrayList<>();
    
    ProductoServiceGrpc.ProductoServiceStub asyncStub;
    ProductoRequest request = ProductoRequest.newBuilder().build();
    
    public ProductoService() {
        this.asyncStub = ProductoServiceGrpc.newStub(GrpcChannelManager.getChannel());
    }
    
    public void escucharProductos(){
        asyncStub.escucharNuevosProductos(request, 
            new StreamObserver<ProductoResponse>() {

                @Override
                public void onNext(ProductoResponse response) {
                    List<Producto> listaProductoGrpc = response.getProductosList();
                    for (Producto productoProto : listaProductoGrpc) {
                        notifySubscribers(ProductoMapper.toEntity(productoProto));
                    }
                }

                @Override
                public void onError(Throwable t) {
                    t.printStackTrace();
                }

                @Override
                public void onCompleted() {
                    System.out.println("Servidor cerró stream");
                }
        });
    }

    @Override
    public void subscribe(SubscriberClient subscriber) {
       subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(SubscriberClient subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers(entidades.Producto productoNuevo) {
        for (SubscriberClient subscriberClient : subscriberList) {
            subscriberClient.update(productoNuevo);
            System.out.println("MENSAJE");
        }
    }
}