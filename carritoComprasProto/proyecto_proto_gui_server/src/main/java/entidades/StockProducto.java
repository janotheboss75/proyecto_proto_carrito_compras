package entidades;

/**
 *
 * @author janot
 */
public class StockProducto {
    Producto producto;
    int stock;

    public StockProducto(Producto producto, int stock) {
        this.producto = producto;
        this.stock = stock;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
