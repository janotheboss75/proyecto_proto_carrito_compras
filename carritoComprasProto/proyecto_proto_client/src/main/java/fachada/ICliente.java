package fachada;

import entidades.ProductoCarrito;
import interfaces.SubscriberClient;
import java.util.List;


/**
 *
 * @author janot
 */
public interface ICliente {
    public void conectarConServidor();
    
    public void cargarDatosExistentes();
    
    public void subscribirAProductoService(SubscriberClient subscriberClient);
    
    public void subscribirAStatusProducto(SubscriberClient subscriberClient);
    
    public void realizarCompra(List<ProductoCarrito> carrito);
    
}
