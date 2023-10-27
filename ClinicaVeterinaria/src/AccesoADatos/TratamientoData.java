package AccesoADatos;

import Entidades.Medicamento;
import Entidades.Tratamiento;
import Vistas.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TratamientoData {

    private Connection con = null;

    public TratamientoData() {
        con = Conexion.getConexion();
    }

    public Tratamiento buscarTratamiento(int id) {
        ArrayList<Medicamento> medicamento = new ArrayList<>();
        String sql = "SELECT idTratamiento, tipoDeTratamiento, descripcion, idMedicamento, importe, activo FROM tratamiento WHERE idTratamiento = ?";
        PreparedStatement ps;
        Tratamiento tratamiento = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tratamiento = new Tratamiento();
                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                tratamiento.setTipoDeTratamiento(rs.getString("tipoDeTratamiento"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                
                String[] idMedicina = rs.getString("idMedicamento").split(",");
                for(String medis: idMedicina){
                    int medicinas = Integer.parseInt(medis);
                    medicamento.add(Menu.medicamentoData.buscarMedicamento(medicinas));
                }
                tratamiento.setMedicamento(medicamento);
                
                
                tratamiento.setPrecio(rs.getDouble("importe"));
                tratamiento.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la base de datos");
        }
        return tratamiento;
    }

    public void guardarTratamiento(Tratamiento trat) {
        String medis = "";
        PreparedStatement ps;
        String sql = "INSERT INTO tratamiento(tipoDeTratamiento, descripcion, idMedicamento, importe, activo) VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, trat.getTipoDeTratamiento());
            ps.setString(2, trat.getDescripcion());
            for(Medicamento m : trat.getMedicamento()){
                if(medis.equals("")){
                    medis = m.getId() + ""; 
                }else{
                    medis = medis + "," + m.getId();
                } 
            }
            ps.setString(3, medis);
            ps.setDouble(4, trat.getPrecio());
            ps.setBoolean(5, true);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se guardo el tratamiento correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se guardo el tratamiento");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la base de datos");
        }
    }

    public void editarTratamiento(Tratamiento trat) {
        String medis = "";
        PreparedStatement ps;
        String sql = "UPDATE tratamiento SET tipoDeTratamiento = ?, descripcion = ?, idMedicamento = ?, importe = ? WHERE idTratamiento=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, trat.getTipoDeTratamiento());
            ps.setString(2, trat.getDescripcion());
            
            for(Medicamento m : trat.getMedicamento()){
                if(medis.equals("")){
                    medis = m.getId() + ""; 
                }else{
                    medis = medis + "," + m.getId();
                } 
            }
            ps.setString(3, medis);
            ps.setDouble(4, trat.getPrecio());
            ps.setInt(5, trat.getIdTratamiento());

            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo el tratamiento correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizo el tratamiento");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error en la base de datos");
        }

    }

    public void altaOBajaTratamiento(Tratamiento trat) {
        PreparedStatement ps;
        String sql = "UPDATE tratamiento SET activo = ? WHERE idTratamiento=?";
        try {
            ps = con.prepareStatement(sql);
            if (trat.isActivo()) {
                ps.setInt(1, 0);
                 JOptionPane.showMessageDialog(null, "El tratamiento se dio de baja");
            } else {
                ps.setInt(1, 1);
                 JOptionPane.showMessageDialog(null, "El tratamiento se dio de alta");
            }
            ps.setInt(2, trat.getIdTratamiento());
            int rs = ps.executeUpdate();

            if (rs == 1) {              
                JOptionPane.showMessageDialog(null, "Se actualizo el tratamiento correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizo el tratamiento");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos");
        }
    }

    public ArrayList<Tratamiento> listarTratamiento() {
        ArrayList<Tratamiento> lista = new ArrayList<>();
        Tratamiento tratamiento = null;
        ArrayList<Medicamento> medicamento = new ArrayList<>();
        
        String sql = "SELECT idTratamiento, tipoDeTratamiento, descripcion, idMedicamento, importe, activo FROM tratamiento";
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tratamiento = new Tratamiento();
                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                tratamiento.setTipoDeTratamiento(rs.getString("tipoDeTratamiento"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                
                String[] idMedicina = rs.getString("idMedicamento").split(",");
                for(String medis: idMedicina){
                    int medicinas = Integer.parseInt(medis);
                    medicamento.add(Menu.medicamentoData.buscarMedicamento(medicinas));
                }
                tratamiento.setMedicamento(medicamento);
               
                tratamiento.setPrecio(rs.getDouble("importe"));
                tratamiento.setActivo(rs.getBoolean("activo"));

                lista.add(tratamiento);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en cargar la lista de tratamientos");
        }

        return lista;
    }
 public ArrayList<Tratamiento> listarTratamientoActivos() {
        ArrayList<Tratamiento> lista = new ArrayList<>();
        Tratamiento tratamiento = null;
        ArrayList<Medicamento> medicamento = new ArrayList<>();
        
        String sql = "SELECT idTratamiento, tipoDeTratamiento, descripcion, idMedicamento, importe, activo FROM tratamiento WHERE activo = 1";
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tratamiento = new Tratamiento();
                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                tratamiento.setTipoDeTratamiento(rs.getString("tipoDeTratamiento"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                
                String[] idMedicina = rs.getString("idMedicamento").split(",");
                for(String medis: idMedicina){
                    int medicinas = Integer.parseInt(medis);
                    medicamento.add(Menu.medicamentoData.buscarMedicamento(medicinas));
                }
                tratamiento.setMedicamento(medicamento);
               
                tratamiento.setPrecio(rs.getDouble("importe"));
                tratamiento.setActivo(rs.getBoolean("activo"));

                lista.add(tratamiento);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en cargar la lista de tratamientos");
        }

        return lista;
    }
}
