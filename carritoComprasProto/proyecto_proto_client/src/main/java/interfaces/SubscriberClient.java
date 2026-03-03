package interfaces;

import entidades.Producto;
import entidades.StatusPago;

/**
 *
 * @author janot
 */
public interface SubscriberClient {
    public void update(Producto productoNuevo);
    
    public void update(StatusPago statusPago);
}
