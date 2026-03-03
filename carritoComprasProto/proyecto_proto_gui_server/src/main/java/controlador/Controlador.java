/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import entidades.StockProducto;
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
    public void mostrarPantallaInventario() {
        modeloModificable.mostrarPantallaInventario();
    }

    @Override
    public void ocultarPantallaInventario() {
        modeloModificable.ocultarPantallaInventario();
    }

    @Override
    public void mostrarPantallaAgregarProducto() {
        modeloModificable.mostrarPantallaAgregarProducto();
    }

    @Override
    public void ocultarPantallaAgregarProducto() {
        modeloModificable.ocultarPantallaAgregarProducto();
    }

    @Override
    public void agregarProductoAInventario(StockProducto stockProducto) {
        modeloModificable.agregarProductoAInventario(stockProducto);
    }
    
}
