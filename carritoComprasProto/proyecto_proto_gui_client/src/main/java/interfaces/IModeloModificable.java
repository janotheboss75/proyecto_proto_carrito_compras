package interfaces;

import entidades.Producto;
import entidades.ProductoCarrito;

/**
 *
 * @author janot
 */
public interface IModeloModificable {
    public void mostrarPantallaCarritoCompras();
    
    public void ocultarPantallaCarritoCompras();
    
    public void mostrarPantallaCantidadProducto();
    
    public void ocultarPantallaCantidadProducto();
    
    public void seleccionarProducto(Producto producto);
    
    public void agregarProductoAlCarrito(ProductoCarrito productoCarrito);
}
