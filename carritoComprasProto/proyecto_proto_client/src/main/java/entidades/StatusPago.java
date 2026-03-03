package entidades;

/**
 *
 * @author janot
 */
public class StatusPago {
    private String estado;
    private double total;

    public StatusPago(String estado, double total) {
        this.estado = estado;
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
