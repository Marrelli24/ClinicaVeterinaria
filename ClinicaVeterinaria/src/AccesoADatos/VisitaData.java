package AccesoADatos;

import java.sql.Connection;

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

}
