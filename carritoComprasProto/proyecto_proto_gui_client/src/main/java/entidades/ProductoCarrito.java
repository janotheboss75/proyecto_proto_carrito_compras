package entidades;

/**
 *
 * @author janot
 */
public class ProductoCarrito {
    private Producto producto;
    private int cantidad;

    public ProductoCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        double redondeado = Math.round((producto.getPrecio()*cantidad) * 100.0) / 100.0;
        return producto.getNombre() + " $" + producto.getPrecio() + " x " +  cantidad + " =  $" + redondeado;
    }
    
}
