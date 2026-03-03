package interfaces;

import entidades.StockProducto;
import java.util.List;

/**
 *
 * @author janot
 */
public interface IModeloModificable {
    public void actualizarInventario(List<StockProducto> inventario);
}
