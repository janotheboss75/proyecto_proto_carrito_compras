package implementaciones;

import entidades.StockProducto;
import interfaces.IModeloLeible;
import interfaces.IModeloModificable;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.UUID;
import valdez.alejandro.carrito.grpc.CompraRequest;
import valdez.alejandro.carrito.grpc.CompraResponse;
import valdez.alejandro.carrito.grpc.CompraServiceGrpc;
import valdez.alejandro.carrito.grpc.EstadoCompra;
import valdez.alejandro.carrito.grpc.ProductoCarrito;

/**
 *
 * @author janot
 */
public class CompraServiceImpl extends CompraServiceGrpc.CompraServiceImplBase {
    IModeloLeible modeloLeible;
    IModeloModificable modeloModificable;
    
    
    public CompraServiceImpl(IModeloLeible modeloLeible, IModeloModificable modeloModificable) {
        this.modeloLeible = modeloLeible;
        this.modeloModificable = modeloModificable;
    }

    @Override
    public void procesarCompra(CompraRequest request,
                               StreamObserver<CompraResponse> responseObserver) {

            List<entidades.StockProducto> inventario = modeloLeible.obtenerInventario();


            double subtotal = 0.0;

            //Validar stock
            for (ProductoCarrito item : request.getItemsList()) {

                entidades.StockProducto stock = buscarStock(item.getProductoId(),inventario);

                if (stock == null || stock.getStock() < item.getCantidad()) {

                    responseObserver.onNext(
                            CompraResponse.newBuilder()
                                    .setEstado(EstadoCompra.SIN_STOCK)
                                    .build()
                    );
                    responseObserver.onCompleted();
                    return;
                }

                subtotal += stock.getProducto().getPrecio()
                        * item.getCantidad();
            }

            //Descontar stock
            for (ProductoCarrito item : request.getItemsList()) {
                StockProducto stock = buscarStock(item.getProductoId(),inventario);
                stock.reducirStock(item.getCantidad());
            }

            double impuestos = subtotal * 0.16;
            double total = subtotal + impuestos;
            
            modeloModificable.actualizarInventario(inventario);

            responseObserver.onNext(
                    CompraResponse.newBuilder()
                            .setTransaccionId(UUID.randomUUID().toString())
                            .setSubtotal(subtotal)
                            .setImpuestos(impuestos)
                            .setTotalPagar(total)
                            .setEstado(EstadoCompra.APROBADO)
                            .build()
            );

            responseObserver.onCompleted();
        
    }

    private entidades.StockProducto buscarStock(String productoId, List<entidades.StockProducto> inventario) {
        for (entidades.StockProducto stock : inventario) {
            if (stock.getProducto().getId().equals(productoId)) {
                return stock;
            }
        }
        return null;
    }

    public void setModeloLeible(IModeloLeible modeloLeible) {
        this.modeloLeible = modeloLeible;
    }
    
}
