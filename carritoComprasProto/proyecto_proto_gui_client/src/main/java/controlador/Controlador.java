package controlador;

import entidades.Producto;
import entidades.ProductoCarrito;
import interfaces.IControlador;
import interfaces.IModeloModificable;

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

    @Override
    public void seleccionarProducto(Producto producto) {
        modeloModificable.seleccionarProducto(producto);
    }

    @Override
    public void agregarProductoAlCarrito(ProductoCarrito productoCarrito) {
        modeloModificable.agregarProductoAlCarrito(productoCarrito);
    }
    
}
