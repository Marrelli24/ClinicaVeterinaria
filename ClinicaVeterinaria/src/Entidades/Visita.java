package Entidades;

import java.time.LocalDate;

public class Visita {

    private int idVisita;
    private Mascota mascota;
    private LocalDate fechaVisita;
    private String detalle;
    private double peso;
    private Tratamiento tratamiento;
    private boolean pago;

    public Visita(int idVisita, Mascota mascota, LocalDate fechaVisita, String detalle, double peso, Tratamiento tratamiento, boolean pago) {
        this.idVisita = idVisita;
        this.mascota = mascota;
        this.fechaVisita = fechaVisita;
        this.detalle = detalle;
        this.peso = peso;
        this.tratamiento = tratamiento;
        this.pago = pago;
    }

    public Visita(Mascota mascota, LocalDate fechaVisita, String detalle, double peso, Tratamiento tratamiento, boolean pago) {
        this.mascota = mascota;
        this.fechaVisita = fechaVisita;
        this.detalle = detalle;
        this.peso = peso;
        this.tratamiento = tratamiento;
        this.pago = pago;
    }

    public Visita() {
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Visita{" + "idVisita=" + idVisita + ", mascota=" + mascota + ", fechaVisita=" + fechaVisita + ", detalle=" + detalle + ", peso=" + peso + ", tratamiento=" + tratamiento + '}';
    }

}
