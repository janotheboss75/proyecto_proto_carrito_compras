package entidades;

import java.util.List;

/**
 *
 * @author janot
 */
public class Carrito {
    String usuario;
    List<ProductoCarrito> listItems;

    public Carrito(String usuario, List<ProductoCarrito> listItems) {
        this.usuario = usuario;
        this.listItems = listItems;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<ProductoCarrito> getListItems() {
        return listItems;
    }

    public void setListItems(List<ProductoCarrito> listItems) {
        this.listItems = listItems;
    }
    
}
