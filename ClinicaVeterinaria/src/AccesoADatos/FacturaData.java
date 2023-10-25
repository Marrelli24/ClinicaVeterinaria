package AccesoADatos;

import Entidades.Factura;
import Vistas.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FacturaData {
     private Connection con = null;

    public FacturaData() {
          con = Conexion.getConexion();
    }
      public void guardarFactura(Factura factura) {
        String sql = "INSERT INTO factura(idVisita) VALUES (?)";
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, factura.getVisita().getIdVisita());
       
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                factura.setNroFactura(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Factura generada");
            } else {
//                JOptionPane.showMessageDialog(null, "No se pudo generar factura");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos"+ ex);
        }

    }
       public Factura buscarFacturaPorIDVisita(int id) {
        Factura factura = null;
        String sql = ("SELECT NroFactura, idVisita FROM factura WHERE idVisita=?");
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                factura = new Factura();
                factura.setNroFactura(rs.getInt("NroFactura"));
                factura.setVisita(Menu.visitaData.buscarVisitaPorId(rs.getInt("idVisita")));   
            }

        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error en base de datos");
        }
        return factura;
    }
}
