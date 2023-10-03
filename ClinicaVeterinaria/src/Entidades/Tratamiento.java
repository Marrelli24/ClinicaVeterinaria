package Entidades;

public class Tratamiento {
    
    private int idTRatamiento;
    private String tipoDeTratamiento;
    private String descripcion;
    private String medicamento;
    private double precio;
    private boolean activo;

    public Tratamiento() {
    }

    public Tratamiento(int idTRatamiento, String tipoDeTratamiento, String descripcion, String medicamento, double precio, boolean activo) {
        this.idTRatamiento = idTRatamiento;
        this.tipoDeTratamiento = tipoDeTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.precio = precio;
        this.activo = activo;
    }

    public Tratamiento(String tipoDeTratamiento, String descripcion, String medicamento, double precio, boolean activo) {
        this.tipoDeTratamiento = tipoDeTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.precio = precio;
        this.activo = activo;
    }

    public int getIdTRatamiento() {
        return idTRatamiento;
    }

    public void setIdTratamiento(int idTRatamiento) {
        this.idTRatamiento = idTRatamiento;
    }

    public String getTipoDeTratamiento() {
        return tipoDeTratamiento;
    }

    public void setTipoDeTratamiento(String tipoDeTratamiento) {
        this.tipoDeTratamiento = tipoDeTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    @Override
    public String toString(){
        return tipoDeTratamiento;
    }
    
}
