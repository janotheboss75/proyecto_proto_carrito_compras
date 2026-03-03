package fachada;

import interfaces.SubscriberClient;
import services.ProductoService;

/**
 *
 * @author janot
 */
public class Cliente implements ICliente{
    ProductoService productoService = new ProductoService();
    
    @Override
    public void conectarConServidor() {
        productoService.escucharProductos("cliente1"); 
    }

    @Override
    public void subscribirAProductoService(SubscriberClient subscriberClient) {
        productoService.subscribe(subscriberClient);
    }

    @Override
    public void cargarDatosExistentes() {
        productoService.listarProductosExistentesEnServidor("cliente1");
    }
    
    
    
}
