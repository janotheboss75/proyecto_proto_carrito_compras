package interfaces;

import entidades.Producto;
import entidades.ProductoCarrito;

/**
 *
 * @author janot
 */
public interface IControlador {
    public void mostrarPantallaCarritoCompras();
    
    public void ocultarPantallaCarritoCompras();
    
    public void mostrarPantallaCantidadProducto();
    
    public void ocultarPantallaCantidadProducto();
    
    public void mostrarPantallaStatusProducto();
    
    public void ocultarPantallaStatusProducto();
    
    public void seleccionarProducto(Producto producto);
    
    public void agregarProductoAlCarrito(ProductoCarrito productoCarrito);
    
    public void realizarCompra();
    
    public void limpiarCarrito();
    
    public void limpiarStatusPago();
}
