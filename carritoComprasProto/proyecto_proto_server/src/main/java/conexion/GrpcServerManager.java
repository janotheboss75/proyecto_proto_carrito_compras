package conexion;

import implementaciones.ProductoServiceImpl;
/**
 *
 * @author janot
 */
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class GrpcServerManager {

    private static final int PORT = 55051;
    private io.grpc.Server server;
    private ProductoServiceImpl productoService;

    public void start() {
        try {
            productoService = new ProductoServiceImpl();

            server = ServerBuilder
                    .forPort(PORT)
                    .addService(productoService)
                    .build()
                    .start();

            System.out.println("Server escuchando en el Puerto: " + PORT + "...");
            //server.awaitTermination();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        if (server != null) server.shutdown();
    }

    public ProductoServiceImpl getProductoService() {
        return productoService;
    }
}