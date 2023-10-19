package AccesoADatos;

import Entidades.Medicamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MedicamentoData {

    private Connection con = null;

    public MedicamentoData() {
        con = Conexion.getConexion();
    }

    public Medicamento buscarMedicamento(int id) {
        String sql = "SELECT idMedicamento, nombre, precio FROM medicamento WHERE idMedicamento = ?";
        PreparedStatement ps;
        Medicamento m = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                m = new Medicamento();
                m.setIdMedicamento(rs.getInt("idMedicamento"));
                m.setNombre(rs.getString("nombre"));
                m.setPrecio(rs.getDouble("precio"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la base de datos");
        }
        return m;
    }

    public void nuevoMedicamento(Medicamento m) {
        PreparedStatement ps;
        String sql = "INSERT INTO medicamento(nombre, precio) VALUES (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getNombre());
            ps.setDouble(2, m.getPrecio());
            int rs = ps.executeUpdate();

            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se guardo el medicamento correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se guardo el medicamento");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la base de datos");
        }
    }

    public void editMedicamento(Medicamento m) {
        PreparedStatement ps;
        String sql = "UPDATE tratamiento SET tipoDeTratamiento = ?, descripcion = ?, idMedicamento = ?, importe = ? WHERE idMedicamento=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getNombre());
            ps.setDouble(4, m.getPrecio());
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo el medicamento");
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizo el medicamento");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error en la base de datos");
        }
    }

    public void borrarMedicamento(int id) {
        String sql = "DELETE FROM medicamento WHERE idMedicamento=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el medicamento");
            } else {
                JOptionPane.showMessageDialog(null, "No se elimino el medicamento");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }
    }

    public ArrayList<Medicamento> listarMedicamento() {
        ArrayList<Medicamento> lista = new ArrayList<>();
        Medicamento m = null;

        String sql = "SELECT idMedicamento, nombre, precio FROM medicamento";
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                m = new Medicamento();
                m.setIdMedicamento(rs.getInt("idMedicamento"));
                m.setNombre(rs.getString("nombre"));
                m.setPrecio(rs.getDouble("precio"));

                lista.add(m);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en DB al traer lista de medicamentos");
        }

        return lista;
    }

}
