package AccesoADatos;

import Entidades.Visita;
import java.sql.Connection;
import java.util.ArrayList;

public class VisitaData {

    private Connection con = null;
    private ClienteData clienteData;
    private MascotaData mascotaData;
    private TratamientoData tratamientoData;

    public VisitaData() {
        con = Conexion.getConexion();
        clienteData = new ClienteData();
        mascotaData = new MascotaData();
        tratamientoData = new TratamientoData();
    }

    public void guardarVisita(Visita visita) {
    }

    public void editarVisita(Visita visita) {
    }

    public void eliminarVisita(int id) {
    }

    public ArrayList<Visita> listarVisita() {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;

        return lista;
    }
  
     public ArrayList<Visita> buscarVisitaPorId() {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;

        return lista;
    }    
     public ArrayList<Visita> buscarVisitaPorCliente() {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;

        return lista;
    }   
      public ArrayList<Visita> buscarVisitaPorMascota() {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;

        return lista;
    }   
}
