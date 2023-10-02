package Entidades;

public class Cliente {

    private int idCliente;
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private int contactoAlter;

    public Cliente(int idCliente, int dni, String nombre, String apellido, int telefono, String direccion, int contactoAlter) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contactoAlter = contactoAlter;
    }

    public Cliente(int dni, String nombre, String apellido, int telefono, String direccion, int contactoAlter) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contactoAlter = contactoAlter;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getContactoAlter() {
        return contactoAlter;
    }

    public void setContactoAlter(int contactoAlter) {
        this.contactoAlter = contactoAlter;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", contactoAlter=" + contactoAlter + '}';
    }

}
