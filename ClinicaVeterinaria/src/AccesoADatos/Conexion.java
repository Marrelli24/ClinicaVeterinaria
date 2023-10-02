package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "pfclinicaveterinaria";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection conexion;

    private Conexion() {
    }

    public static Connection getConexion() {

        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error en la carga del driver " + ex);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la conexion con la base de datos " + ex);
            }
        }
        return conexion;
    }
}