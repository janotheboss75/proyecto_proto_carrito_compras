package conexion;

import implementaciones.CompraServiceImpl;
import implementaciones.ProductoServiceImpl;
import interfaces.IModeloLeible;
import interfaces.IModeloModificable;
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
    private CompraServiceImpl compraService;
    private IModeloLeible modeloLeible;
    private IModeloModificable modeloModificable;

    public GrpcServerManager(IModeloLeible modeloLeible, IModeloModificable modeloModificable) {
        this.modeloLeible = modeloLeible;
        this.modeloModificable = modeloModificable;
    }

    public void start() {
        try {
            productoService = new ProductoServiceImpl();
            compraService = new CompraServiceImpl(modeloLeible, modeloModificable);
            
            server = ServerBuilder
                    .forPort(PORT)
                    .addService(productoService)
                    .addService(compraService)
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