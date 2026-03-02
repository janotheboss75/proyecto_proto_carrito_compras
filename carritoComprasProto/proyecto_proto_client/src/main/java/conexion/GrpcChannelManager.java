package conexion;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import valdez.alejandro.carrito.grpc.ProductoServiceGrpc;

/**
 *
 * @author janot
 */
public class GrpcChannelManager {

    private static final String HOST = "localhost";
    private static final int PORT = 55051;

    private static ManagedChannel channel;

    private GrpcChannelManager() {}

    public static ManagedChannel getChannel() {
        if (channel == null) {
            channel = ManagedChannelBuilder
                    .forAddress(HOST, PORT)
                    .usePlaintext()
                    .build();
        }
        return channel;
    }

    public static void shutdown() {
        if (channel != null) {
            channel.shutdown();
        }
    }
}
/*
    @Override
    public List<Producto> obtenerProductos() {
        ProductoRequest request = ProductoRequest.newBuilder()
                        .setUsuarioId("ALEJANDRO")
                        .build();

                ProductoResponse response = stub.listarProductos(request);
                //Leer productos
                for (Producto p : response.getProductosList()) {
                    System.out.println("ID: " + p.getId());
                    System.out.println("Nombre: " + p.getNombre());
                    System.out.println("Precio: $" + p.getPrecio());
                    System.out.println("--------------------");
                }
                return response.getProductosList();
    }*/