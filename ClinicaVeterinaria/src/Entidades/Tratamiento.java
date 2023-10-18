package Entidades;

public class Tratamiento {
    
    private int idTratamiento;
    private String tipoDeTratamiento;
    private String descripcion;
    private Medicamento medicamento;
    private double precio;
    private boolean activo;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String tipoDeTratamiento, String descripcion, Medicamento medicamento, double precio, boolean activo) {
        this.idTratamiento = idTratamiento;
        this.tipoDeTratamiento = tipoDeTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.precio = precio;
        this.activo = activo;
    }

    public Tratamiento(String tipoDeTratamiento, String descripcion, Medicamento medicamento, double precio, boolean activo) {
        this.tipoDeTratamiento = tipoDeTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.precio = precio;
        this.activo = activo;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTRatamiento) {
        this.idTratamiento = idTRatamiento;
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

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
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
