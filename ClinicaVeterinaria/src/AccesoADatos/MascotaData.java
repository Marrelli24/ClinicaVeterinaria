package AccesoADatos;

import Entidades.Mascota;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MascotaData {

    private Connection con = null;
    private ClienteData clienteData;

    public MascotaData() {
        con = Conexion.getConexion();
        clienteData = new ClienteData();
    }

    public void guardarMascota(Mascota mascota) {
        String sql = "INSERT INTO cliente(alias, sexo, especie, raza, colorPelo,peso, pesoPromedio, fechaNac, idCliente) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColorPelo());
            ps.setDouble(6, mascota.getPesoActual());
            ps.setDouble(7, mascota.getPesoPromedio());
            ps.setDate(8, Date.valueOf(mascota.getFechaNac()));
            ps.setInt(9, mascota.getCliente().getIdCliente());

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

    public void editarMascota(Mascota mascota) {
        String sql = "UPDATE mascota SET alias = ?, sexo = ?, especie = ?, raza = ?, colorPelo = ?, peso = ?, pesoPromedio = ?, fechaNac = ?, idCliente = ? WHERE idMascota = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColorPelo());
            System.out.println(mascota.getPesoActual());
            ps.setDouble(6, mascota.getPesoActual());
            ps.setDouble(7, mascota.getPesoPromedio());
            ps.setDate(8, Date.valueOf(mascota.getFechaNac()));
            ps.setInt(9, mascota.getCliente().getIdCliente());
            ps.setInt(10, mascota.getIdMascota());

            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos de la mascota");
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizaron los datos de la mascota");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron los datos de la mascota" + ex);
        }
    }

    public ArrayList<Mascota> listarMascotas() {
        ArrayList<Mascota> lista = new ArrayList<>();
        Mascota mascota = null;
        String sql = "SELECT alias, sexo, especie, raza, colorPelo, peso, pesoPromedio, fechaNac, idCliente FROM mascota";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mascota = new Mascota();
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setPesoActual(rs.getDouble("peso"));
                mascota.setPesoPromedio(rs.getDouble("pesoPromedio"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                mascota.setCliente(clienteData.buscarClientePorId(rs.getInt("idCliente")));
                lista.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en cargar la lista de mascotas");
        }

        return lista;
    }

    public Mascota buscarMascotaPorId(int id) {
        Mascota mascota = null;
        String sql = ("SELECT idMascota, alias, sexo, especie, raza, colorPelo, peso, pesoPromedio, fechaNac, idCliente FROM mascota WHERE idMascota=?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setPesoActual(rs.getDouble("peso"));
                mascota.setPesoPromedio(rs.getDouble("pesoPromedio"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                mascota.setCliente(clienteData.buscarClientePorId(rs.getInt("idCliente")));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la mascota");
        }

        return mascota;
    }

    public Mascota buscarMascotaPorCliente(int id) {
        Mascota mascota = null;
        String sql = ("SELECT alias, sexo, especie, raza, colorPelo, peso, pesoPromedio, fechaNac, idCliente FROM mascota WHERE idCliente=?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setPesoActual(rs.getDouble("peso"));
                mascota.setPesoPromedio(rs.getDouble("pesoPromedio"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                mascota.setCliente(clienteData.buscarClientePorId(rs.getInt("idCliente")));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la mascota");
        }

        return mascota;
    }

}
