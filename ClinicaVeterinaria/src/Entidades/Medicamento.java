

package Entidades;


public class Medicamento {

    private int idMedicamento;
    private String nombre;
    private double precio;

    public Medicamento() {
    }
    
    public Medicamento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Medicamento(int idMedicamento, String nombre, double precio) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return idMedicamento + ", " + nombre;
    }
    
    
}
