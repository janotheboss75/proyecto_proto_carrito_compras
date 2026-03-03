package interfaces;

import entidades.Producto;
import entidades.ProductoCarrito;
import entidades.StatusPago;
import java.util.List;

/**
 *
 * @author janot
 */
public interface IModeloLeible {
    public boolean isMostrandoPantallaCarritoCompras();
    
    public boolean isMostrandoPantallaCantidadProducto();
    
    public boolean isMostrandoPantallaStatusPago();
    
    public List<Producto> obtenerProductos();
    
    public List<ProductoCarrito> obtenerProductosDelCarrito();
    
    public Producto obtenerProductoSeleccionado();
    
    public StatusPago obtenerStatusPago();
    
}
