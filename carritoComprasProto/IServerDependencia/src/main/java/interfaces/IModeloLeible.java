package interfaces;

import entidades.StockProducto;
import java.util.List;

/**
 *
 * @author janot
 */
public interface IModeloLeible {
    public boolean isMostrandoPantallaInventario();
    
    public boolean isMostrandoPantallaAgregarProducto();
    
    public List<StockProducto> obtenerInventario();
}
