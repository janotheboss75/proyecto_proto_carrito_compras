package controlador;

import entidades.Producto;
import entidades.ProductoCarrito;
import interfaces.IControlador;
import interfaces.IModeloModificable;
import java.util.List;

/**
 *
 * @author janot
 */
public class Controlador implements IControlador{
    private final IModeloModificable modeloModificable;

    public Controlador(IModeloModificable modeloModificable) {
        this.modeloModificable = modeloModificable;
    }
    
    @Override
    public void mostrarPantallaCarritoCompras() {
       modeloModificable.mostrarPantallaCarritoCompras();
    }

    @Override
    public void ocultarPantallaCarritoCompras() {
        modeloModificable.ocultarPantallaCarritoCompras();
    }

    @Override
    public void mostrarPantallaCantidadProducto() {
        modeloModificable.mostrarPantallaCantidadProducto();
    }

    @Override
    public void ocultarPantallaCantidadProducto() {
        modeloModificable.ocultarPantallaCantidadProducto();
    }

    public void mostrarPantallaStatusProducto() {
        modeloModificable.mostrarPantallaStatusPago();
    }

    @Override
    public void ocultarPantallaStatusProducto() {
        modeloModificable.ocultarPantallaStatusPago();
    }
    
    @Override
    public void seleccionarProducto(Producto producto) {
        modeloModificable.seleccionarProducto(producto);
    }

    @Override
    public void agregarProductoAlCarrito(ProductoCarrito productoCarrito) {
        modeloModificable.agregarProductoAlCarrito(productoCarrito);
    }

    @Override
    public void realizarCompra() {
        modeloModificable.realizarCompra();
    }

    @Override
    public void limpiarCarrito() {
        modeloModificable.limpiarCarrito();
    }

    @Override
    public void limpiarStatusPago() {
        modeloModificable.limpiarStatus();
    }
    
}
