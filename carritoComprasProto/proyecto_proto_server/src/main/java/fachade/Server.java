package fachade;

import conexion.GrpcServerManager;
import entidades.Producto;
import implementaciones.CompraServiceImpl;
import implementaciones.ProductoServiceImpl;
import interfaces.IModeloLeible;
import interfaces.IModeloModificable;
import interfaces.IServer;
import java.util.List;

/**
 *
 * @author janot
 */
public class Server implements IServer{
    GrpcServerManager serverManager;

    public Server(IModeloLeible modeloLeible, IModeloModificable modeloModificable) {
        serverManager = new GrpcServerManager(modeloLeible, modeloModificable);
    }
    
    @Override
    public void prenderServidor() {
        serverManager.start();
    }

    @Override
    public void apagarServidor() {
        serverManager.stop();
    }

    @Override
    public void enviarProductoAClientes(entidades.Producto producto) {

        ProductoServiceImpl service = serverManager.getProductoService();

        if (service != null) {
            service.notificarNuevoProducto(producto);
        } else {
            System.out.println("Servidor aún no iniciado");
        }
    }

    @Override
    public void enviarProductosExistentes(List<Producto> listaProductos) {
        ProductoServiceImpl service = serverManager.getProductoService();
        if (service != null) {
            service.setListaInventario(listaProductos);
        } else{
            System.out.println("Servidor aún no iniciado");
        }
    }

}
