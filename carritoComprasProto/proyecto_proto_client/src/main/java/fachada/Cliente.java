package fachada;

import entidades.ProductoCarrito;
import interfaces.SubscriberClient;
import java.util.List;
import services.CompraService;
import services.ProductoService;

/**
 *
 * @author janot
 */
public class Cliente implements ICliente{
    ProductoService productoService = new ProductoService();
    CompraService compraService = new CompraService();
    
    @Override
    public void conectarConServidor() {
        productoService.escucharProductos("cliente1"); 
    }

    @Override
    public void subscribirAProductoService(SubscriberClient subscriberClient) {
        productoService.subscribe(subscriberClient);
    }
    
    @Override
    public void subscribirAStatusProducto(SubscriberClient subscriberClient) {
        compraService.subscribe(subscriberClient);
    }

    @Override
    public void cargarDatosExistentes() {
        productoService.listarProductosExistentesEnServidor("cliente1");
    }

    @Override
    public void realizarCompra(List<ProductoCarrito> carrito) {
        compraService.pagarCarrito("cliente1", carrito);
    }

}
