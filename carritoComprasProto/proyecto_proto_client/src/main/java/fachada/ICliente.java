package fachada;

import interfaces.SubscriberClient;


/**
 *
 * @author janot
 */
public interface ICliente {
    public void conectarConServidor();
    
    public void cargarDatosExistentes();
    public void subscribirAProductoService(SubscriberClient subscriberClient);
}
