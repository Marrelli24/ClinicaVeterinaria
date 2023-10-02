package AccesoADatos;

import Entidades.Mascota;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MascotaData {

    private Connection con = null;

    public MascotaData() {
        con = Conexion.getConexion();
    }

    public void guardarCliente(Mascota mascota) {
        String sql = "INSERT INTO cliente(alias, sexo, especie, raza, colorPelo, pesoPromedio, fechaNac) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getRaza());
            ps.setString(4, mascota.getColorPelo());
            ps.setDouble(5, mascota.getPesoPromedio());
            ps.setDate(6, Date.valueOf(mascota.getFechaNac()));

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mascota.setIdMascota(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mascota guardada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la mascota");
        }
    }    

    public void editarCliente(Mascota mascota) {
        String sql = "UPDATE cliente SET alias = ?, sexo = ?, especie = ?, raza = ?, colorPelo = ?, pesoPromedio = ?, fechaNac = ? WHERE idMascota = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
          ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getRaza());
            ps.setString(4, mascota.getColorPelo());
            ps.setDouble(5, mascota.getPesoPromedio());
            ps.setDate(6, Date.valueOf(mascota.getFechaNac()));
            
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizó los datos de su mascota correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizó la mascota");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo editar la mascota");
        }
    }
}
