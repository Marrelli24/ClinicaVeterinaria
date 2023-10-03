package AccesoADatos;

import Entidades.Cliente;
import Entidades.Tratamiento;
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
    
    public Tratamiento buscarTratamiento(int id){
        String sql = "SELECT tipoDeTratamiento, descripcion, medicamento, importe, activo FROM tratamiento WHERE idTratamiento = ?";
        PreparedStatement ps;
        Tratamiento tratamiento = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                String tipoDeTratamiento = rs.getString("tipoDeTratamiento");
                String desc = rs.getString("descripcion");
                String med = rs.getString("medicamento");
                double precio = rs.getInt("importe");
                boolean act = rs.getBoolean("activo");
                tratamiento = new Tratamiento(tipoDeTratamiento, desc, med, precio, act);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la base de datos");
        }
        return tratamiento;
    }
    
    public void guardarTratamiento(Tratamiento trat){
        PreparedStatement ps;
        String sql = "INSERT INTO tratamiento(tipoDeTratamiento, descripcion, medicina, importe, activo) VALUES (?,?,?,?,?)";
        
        
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, trat.getTipoDeTratamiento());
            
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la base de datos");
        }
        
        
    }
    
    public void editarTratamiento(){
    }
    
    public void altaOBajaTratamiento(){
    }
    
     public ArrayList<Tratamiento> listarTratamiento() {
        ArrayList<Tratamiento> lista = new ArrayList<>();
        Tratamiento tratamiento = null;
        
        String sql = "SELECT idTratamiento, tipoDeTratamiento, descripcion, medicamento, importe, activo FROM tratamiento";
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                tratamiento = new Tratamiento();
                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                tratamiento.setTipoDeTratamiento(rs.getString("tipoDeTratamiento"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setMedicamento(rs.getString("medicamento"));
                tratamiento.setPrecio(rs.getDouble("importe"));
                tratamiento.setActivo(rs.getBoolean("activo"));
               
                lista.add(tratamiento);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en cargar la lista de clientes");
        }

        return lista;
    }
    
}
