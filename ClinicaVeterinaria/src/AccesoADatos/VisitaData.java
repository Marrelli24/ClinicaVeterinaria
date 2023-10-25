package AccesoADatos;

import Entidades.Factura;
import Entidades.Mascota;
import Entidades.Visita;
import Vistas.Menu;
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
        String sql = "INSERT INTO visita(idMascota, fechaVisita, detalle, peso, idTratamiento, pago) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setDate(2, Date.valueOf(visita.getFechaVisita()));
            ps.setString(3, visita.getDetalle());
            ps.setDouble(4, visita.getPeso());
            ps.setInt(5, visita.getTratamiento().getIdTratamiento());
            ps.setBoolean(6, visita.isPago());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                visita.setIdVisita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                chequeoUVisita(visita.getMascota().getIdMascota());
                Factura factura = new Factura();
                factura.setVisita(visita);
                Menu.facturaData.guardarFactura(factura);
            } else {
                JOptionPane.showConfirmDialog(null, "No se pudo guardar el registro");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex);
        }

    }

    public void editarVisita(Visita visita) {
        String sql = "UPDATE visita SET idMascota = ?, fechaVisita = ?, detalle = ?, peso = ?, idTratamiento = ?, pago = ? WHERE idVisita = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setDate(2, Date.valueOf(visita.getFechaVisita()));
            ps.setString(3, visita.getDetalle());
            ps.setDouble(4, visita.getPeso());
            ps.setInt(5, visita.getTratamiento().getIdTratamiento());
            ps.setBoolean(6, visita.isPago());
            ps.setInt(7, visita.getIdVisita());
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo los datos de la Visita correctamente");
                chequeoUVisita(visita.getMascota().getIdMascota());
                Factura factura;
                factura = Menu.facturaData.buscarFacturaPorIDVisita(visita.getIdVisita());
                if (factura == null) {
                    factura= new Factura(visita);                 
                    Menu.facturaData.guardarFactura(factura);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizo los datos de la Visita");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos");
        }
    }

    public void eliminarVisita(int id) {
        int idMascota = buscarVisitaPorId(id).getMascota().getIdMascota();
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
            chequeoUVisita(idMascota);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }
    }

    public ArrayList<Visita> listarVisita() {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;
        String sql = "SELECT idVisita, idMascota, fechaVisita, detalle, peso, idTratamiento, pago FROM visita ORDER BY fechaVisita DESC;";
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
                visita.setPago(rs.getBoolean("pago"));
                lista.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }
        return lista;
    }

    public Visita buscarVisitaPorId(int id) {
        Visita visita = null;
        String sql = "SELECT idVisita, idMascota, fechaVisita, detalle, peso, idTratamiento, pago FROM visita WHERE idVisita = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(mascotaData.buscarMascotaPorId(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(tratamientoData.buscarTratamiento(rs.getInt("idTratamiento")));
                visita.setPago(rs.getBoolean("pago"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }

        return visita;
    }

    public ArrayList<Visita> buscarVisitaPorCliente(int id) {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;
        String sql = "SELECT idVisita, visita.idMascota, fechaVisita, detalle, visita.peso, idTratamiento, pago FROM visita, mascota WHERE visita.idMascota=mascota.idMascota and mascota.idCliente=?  ORDER BY fechaVisita DESC";
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
                visita.setPago(rs.getBoolean("pago"));
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
        String sql = "SELECT idVisita, idMascota, fechaVisita, detalle, peso, idTratamiento, pago FROM visita WHERE idMascota = ?  ORDER BY fechaVisita DESC";
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
                visita.setPago(rs.getBoolean("pago"));
                lista.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }

        return lista;
    }

    public ArrayList<Visita> buscarVisitaPorTratamiento(int id) {
        ArrayList<Visita> lista = new ArrayList<>();
        Visita visita = null;
        String sql = "SELECT idVisita, idMascota, fechaVisita, detalle, peso, idTratamiento, pago FROM visita WHERE idTratamiento = ? ORDER BY fechaVisita DESC";
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
                visita.setPago(rs.getBoolean("pago"));
                lista.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }

        return lista;
    }

    public double pesoPromedio(int id) {
        double pesoPromedio = 0;
        int x = 0;
        String sql = "SELECT COUNT(fechaVisita) AS cantidad, SUM(peso) AS total FROM ( SELECT fechaVisita, peso FROM visita WHERE idMascota = ? ORDER BY fechaVisita DESC LIMIT 3 ) subquery;";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                x = rs.getInt("cantidad");
                pesoPromedio = (rs.getDouble("total")) / x;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }
        return pesoPromedio;
    }

    public Visita ultimaVisita(int id) {
        Visita visita = null;
        String sql = "SELECT * FROM visita WHERE idMascota = ? ORDER BY fechaVisita DESC, idVisita DESC LIMIT 1;";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(mascotaData.buscarMascotaPorId(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(tratamientoData.buscarTratamiento(rs.getInt("idTratamiento")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }

        return visita;
    }

    public void chequeoUVisita(int idMascota) {

        Visita visitaUltima = new Visita();
        visitaUltima = ultimaVisita(idMascota);
        Mascota mascota = new Mascota();
        mascota = mascotaData.buscarMascotaPorId(idMascota);
        mascota.setPesoActual(visitaUltima.getPeso());
        mascota.setPesoPromedio(pesoPromedio(idMascota));
        mascotaData.editarMascota(mascota);
    }

}
