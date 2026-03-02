package interfaces;

import entidades.Producto;
import entidades.ProductoCarrito;
import java.util.List;

/**
 *
 * @author janot
 */
public interface IModeloLeible {
    public boolean isMostrandoPantallaCarritoCompras();
    
    public boolean isMostrandoPantallaCantidadProducto();
    
    public List<Producto> obtenerProductos();
    
    public List<ProductoCarrito> obtenerProductosDelCarrito();
    
    public Producto obtenerProductoSeleccionado();
    
}
