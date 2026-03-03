package interfaces;

import entidades.Producto;
import entidades.ProductoCarrito;
import java.util.List;

/**
 *
 * @author janot
 */
public interface IModeloModificable {
    public void mostrarPantallaCarritoCompras();
    
    public void ocultarPantallaCarritoCompras();
    
    public void mostrarPantallaCantidadProducto();
    
    public void ocultarPantallaCantidadProducto();
    
    public void mostrarPantallaStatusPago();
    
    public void ocultarPantallaStatusPago();
    
    public void seleccionarProducto(Producto producto);
    
    public void agregarProductoAlCarrito(ProductoCarrito productoCarrito);
    
    public void realizarCompra();
    
    public void limpiarCarrito();
    
    public void limpiarStatus();
    
}
