
package Entidades;

public class Factura {
    private int nroFactura;
    private Visita visita;

    public Factura(int nroFactura, Visita visita) {
        this.nroFactura = nroFactura;
        this.visita = visita;
    }

    public Factura(Visita visita) {
        this.visita = visita;
    }
    
    public Factura() {
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Visita getVisita() {
        return visita;
    }

    public void setVisita(Visita visita) {
        this.visita = visita;
    }
        
}
