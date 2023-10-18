package AccesoADatos;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteData {

    private Connection con = null;

    public ClienteData() {
        con = Conexion.getConexion();
    }

    public void guardarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente(dni, nombre, apellido, telefono, direccion, nombreAlterno, contactoAlternativo) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getNombreAlterno());
            ps.setInt(7, cliente.getContactoAlter());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente guardado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el cliente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos"+ ex);
        }

    }

    public void editarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET dni = ?, nombre = ?, apellido = ?, telefono = ?, direccion = ?, nombreAlterno = ?, contactoAlternativo = ? WHERE idCliente=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getNombreAlterno());
            ps.setInt(7, cliente.getContactoAlter());
            ps.setInt(8, cliente.getIdCliente());
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo los dato del Cliente correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizo el Cliente");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCliente(int id) {
        String sql = "DELETE FROM cliente WHERE idcliente=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino los datos del cliente");
            } else {
                JOptionPane.showMessageDialog(null, "No se elimino los datos del cliente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }
    }

    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> lista = new ArrayList<>();
        Cliente cliente = null;
        String sql = "SELECT idCliente, dni, nombre, apellido, telefono, direccion, nombreAlterno, contactoAlternativo FROM cliente ORDER BY apellido, nombre;";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setNombreAlterno(rs.getString("nombreAlterno"));
                cliente.setContactoAlter(rs.getInt("contactoAlternativo"));
                lista.add(cliente);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }

        return lista;
    }

    public Cliente buscarClientePorId(int id) {
        Cliente cliente = null;
        String sql = ("SELECT idCliente, dni, nombre, apellido, telefono, direccion, nombreAlterno, contactoAlternativo FROM cliente WHERE idCliente=?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setNombreAlterno(rs.getString("nombreAlterno"));
                cliente.setContactoAlter(rs.getInt("contactoAlternativo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }

        return cliente;
    }

    public Cliente buscarClientePorDni(int dni) {
        Cliente cliente = null;
        String sql = ("SELECT idCliente, dni, nombre, apellido, telefono, direccion, nombreAlterno, contactoAlternativo FROM cliente WHERE dni=?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setNombreAlterno(rs.getString("nombreAlterno"));
                cliente.setContactoAlter(rs.getInt("contactoAlternativo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }

        return cliente;
    }
    
    public void altaBaja(){
        
        
        
    }
    
    
    
}
