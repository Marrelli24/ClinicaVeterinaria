package Entidades;

import java.time.LocalDate;

public class Mascota {

    private int idMascota;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String colorPelo;
    private double pesoActual;
    private double pesoPromedio;
    private LocalDate fechaNac;
    private Cliente cliente;

    public Mascota() {
    }

    public Mascota(String alias, String sexo, String especie, String raza, String colorPelo, double pesoActual, double pesoPromedio, LocalDate fechaNac, Cliente cliente) {
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.pesoActual = pesoActual;
        this.pesoPromedio = pesoPromedio;
        this.fechaNac = fechaNac;
        this.cliente = cliente;
    }

    public Mascota(int idMascota, String alias, String sexo, String especie, String raza, String colorPelo, double pesoActual, double pesoPromedio, LocalDate fechaNac, Cliente cliente) {
        this.idMascota = idMascota;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.pesoActual = pesoActual;
        this.pesoPromedio = pesoPromedio;
        this.fechaNac = fechaNac;
        this.cliente = cliente;
    }

    public Mascota(String alias, String sexo, String especie, String raza, String colorPelo, LocalDate fechaNac, Cliente cliente) {
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNac = fechaNac;
        this.cliente = cliente;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
   public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual (double pesoActual) {
        this.pesoActual = pesoActual;
    }
    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Mascota{" + "idMascota=" + idMascota + ", alias=" + alias + ", sexo=" + sexo + ", especie=" + especie + ", raza=" + raza + ", colorPelo=" + colorPelo + ", pesoActual=" + pesoActual + ", pesoPromedio=" + pesoPromedio + ", fechaNac=" + fechaNac + ", cliente=" + cliente.getNombre() + '}';
    }

}
