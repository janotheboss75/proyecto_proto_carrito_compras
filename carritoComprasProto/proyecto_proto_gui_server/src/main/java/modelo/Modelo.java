package modelo;

import entidades.StockProducto;
import interfaces.IModeloLeible;
import interfaces.IModeloModificable;
import interfaces.Publisher;
import interfaces.Subscriber;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janot
 */
public class Modelo implements Publisher, IModeloLeible, IModeloModificable{
    //Lista de subscriptores
    private List<Subscriber> subscriberList = new ArrayList<>();
    
    //Variable bandera para mostrar pantalla inventario
    private boolean mostrarPantallaInventario = false;
    
    //Lista de inventario
    private List<StockProducto> listaInventario = new ArrayList<>();

    public Modelo() {
        
    }
    
    //Metodos de la interfaz IModeloLeible
    @Override
    public boolean isMostrandoPantallaInventario() {
        return mostrarPantallaInventario;
    }
    
    //Metodos de la interfaz IModeloModificable
    @Override
    public void mostrarPantallaInventario() {
        mostrarPantallaInventario = true;
        notifySubscribers();
    }

    @Override
    public void ocultarPantallaInventario() {
        mostrarPantallaInventario = false;
        notifySubscribers();
    }

    @Override
    public void agregarProductoAInventario(StockProducto stockProducto) {
        listaInventario.add(stockProducto);
        notifySubscribers();
    }

    @Override
    public List<StockProducto> obtenerInventario() {
        return listaInventario;
    }
    
    //Metodos de la interfaz Publisher
    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update();
        }
    }

}
