package services;

import conexion.GrpcChannelManager;
import entidades.StatusPago;
import interfaces.SubscriberClient;
import java.util.ArrayList;
import java.util.List;
import valdez.alejandro.carrito.grpc.CompraRequest;
import valdez.alejandro.carrito.grpc.CompraResponse;
import valdez.alejandro.carrito.grpc.CompraServiceGrpc;
import valdez.alejandro.carrito.grpc.ProductoCarrito;

/**
 *
 * @author janot
 */
public class CompraService {
    private final List<SubscriberClient> subscribers = new ArrayList<>();
    
    private final CompraServiceGrpc.CompraServiceBlockingStub blockingStub;

    public CompraService() {
        blockingStub = CompraServiceGrpc.newBlockingStub(GrpcChannelManager.getChannel());
    }
    
    public void pagarCarrito(String usuarioId, List<entidades.ProductoCarrito> carrito) {

            CompraRequest.Builder requestBuilder = CompraRequest.newBuilder()
                    .setUsuarioId(usuarioId);

            for (entidades.ProductoCarrito item : carrito) {

                ProductoCarrito protoItem = ProductoCarrito.newBuilder()
                        .setProductoId(item.getProducto().getId())
                        .setCantidad(item.getCantidad())
                        .build();

                requestBuilder.addItems(protoItem);
            }

            CompraRequest request = requestBuilder.build();

            CompraResponse response = blockingStub.procesarCompra(request);

            StatusPago statusPago = new StatusPago(response.getEstado().toString(), response.getTotalPagar());
            notifySubscribers(statusPago);
            
            System.out.println("Estado: " + response.getEstado());
            System.out.println("Total: " + response.getTotalPagar());
    }
    
    public void subscribe(SubscriberClient subscriber) {
        subscribers.add(subscriber);
    }

    private void notifySubscribers(entidades.StatusPago statusPago) {
        for (SubscriberClient s : subscribers) {
            s.update(statusPago);
        }
    }
    
}
