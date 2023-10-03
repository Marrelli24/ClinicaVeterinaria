package AccesoADatos;

import Entidades.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        String sql = "INSERT INTO visita(idMascota, fechaVisita, detalle, peso, idTratamiento) VALUES (?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setDate(2, Date.valueOf(visita.getFechaVisita()));
            ps.setString(3, visita.getDetalle());
            ps.setDouble(4, visita.getPeso());
            ps.setInt(5, visita.getTratamiento().getIdTratamiento());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                visita.setIdVisita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Registro Guardado");
            } else {
                JOptionPane.showConfirmDialog(null, "No se pudo guardar el registro");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos");
        }
    }

    public void editarVisita(Visita visita) {
        String sql = "UPDATE visita SET idMascota = ?, fechaVisita = ?, detalle = ?, peso = ?, idTratamiento = ? WHERE idVisita = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setDate(2, Date.valueOf(visita.getFechaVisita()));
            ps.setString(3, visita.getDetalle());
            ps.setDouble(4, visita.getPeso());
            ps.setInt(5, visita.getTratamiento().getIdTratamiento());
            ps.setInt(6, visita.getIdVisita());
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo los datos de la Visita correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizo los datos de la Visita");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos");
        }

    }

    public void eliminarVisita(int id) {
        String sql = "DELETE FROM visita WHERE idVisita=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el registro de la visita");
            } else {
                JOptionPane.showMessageDialog(null, "No se elimino el registro de la visita");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }
    }

    public ArrayList<Visita> listarVisita() {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;
        String sql = "SELECT idVisita, idMascota, fechaVisita, detalle, peso, idTratamiento FROM visita";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(mascotaData.buscarMascotaPorId(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(tratamientoData.buscarTratamiento(rs.getInt("idTratamiento")));
                lista.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }
        return lista;
    }

    public ArrayList<Visita> buscarVisitaPorId(int id) {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;
        String sql = "SELECT idVisita, idMascota, fechaVisita, detalle, peso, idTratamiento FROM visita WHERE idVisita = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(mascotaData.buscarMascotaPorId(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(tratamientoData.buscarTratamiento(rs.getInt("idTratamiento")));
                lista.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }

        return lista;
    }

    public ArrayList<Visita> buscarVisitaPorCliente(int id) {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;
        String sql = "SELECT idVisita, visita.idMascota, fechaVisita, detalle, peso, idTratamiento FROM visita, mascota WHERE visita.idMascota=mascota.idMascota and mascota.idCliente=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(mascotaData.buscarMascotaPorId(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(tratamientoData.buscarTratamiento(rs.getInt("idTratamiento")));
                lista.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }

        return lista;
    }

    public ArrayList<Visita> buscarVisitaPorMascota(int id) {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;
        String sql = "SELECT idVisita, idMascota, fechaVisita, detalle, peso, idTratamiento FROM visita WHERE idMascota = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(mascotaData.buscarMascotaPorId(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(tratamientoData.buscarTratamiento(rs.getInt("idTratamiento")));
                lista.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }

        return lista;
    }
}
