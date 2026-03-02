package fachada;

import java.util.List;
import services.ProductoService;

/**
 *
 * @author janot
 */
public class Cliente implements ICliente{
    ProductoService productoService = new ProductoService();
    
    @Override
    public void escucharProductos() {
        productoService.escucharProductos();
    }
    
}
