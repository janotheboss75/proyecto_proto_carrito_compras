package interfaces;

import entidades.StockProducto;

/**
 *
 * @author janot
 */
public interface IModeloModificable {
    public void mostrarPantallaInventario();
    
    public void ocultarPantallaInventario();
    
    public void mostrarPantallaAgregarProducto();
    
    public void ocultarPantallaAgregarProducto();
    
    public void agregarProductoAInventario(StockProducto stockProducto);
    
}
