package interfaces;

import java.util.List;

/**
 *
 * @author janot
 */
public interface IServer{
    public void prenderServidor();
    
    public void apagarServidor();
    
    public void enviarProductosExistentes(List<entidades.Producto> listaProductos);
    
    public void enviarProductoAClientes(entidades.Producto nuevoProducto);
}
