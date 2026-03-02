package valdez.alejandro.proyecto_proto_server;

import implementaciones.ProductoServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

/**
 *
 * @author janot
 */
public class Proyecto_proto_server {

    public static void main(String[] args){
        Server server = ServerBuilder.forPort(55051)
                                     .addService(new ProductoServiceImpl())
                                     .build();
        
        try {
            server.start();
            System.out.println("Servidor gRPC iniciado en el puerto 55051...");
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
