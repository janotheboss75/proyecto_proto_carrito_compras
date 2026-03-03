package interfaces;

import entidades.StockProducto;
import java.util.List;

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
    
    public void actualizarInventario(List<StockProducto> inventario);
    
}
