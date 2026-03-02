package interfaces;

import entidades.Producto;

/**
 *
 * @author janot
 */
public interface PublisherClient {
    public void subscribe(SubscriberClient subscriber);
    public void unsubscribe(SubscriberClient subscriber);
    public void notifySubscribers(Producto productoNuevo);
}
