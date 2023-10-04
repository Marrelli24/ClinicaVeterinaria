package clinicaveterinaria;

import AccesoADatos.ClienteData;
import AccesoADatos.MascotaData;
import Entidades.Cliente;
import AccesoADatos.TratamientoData;
import AccesoADatos.VisitaData;
import Entidades.Mascota;
import Entidades.Visita;

public class ClinicaVeterinaria {
    
    public static void main(String[] args) {

        //Pruebas de Tratamiento
//        TratamientoData trat = new TratamientoData();
//
//        System.out.println(trat.buscarTratamiento(1));
//
//        ClienteData clientedata = new ClienteData();
//        Cliente cliente = new Cliente(38299859, "Ezequiel", "Marrelli", 44, "Calle solari", 1);
//        clientedata.guardarCliente(cliente);
//        System.out.println(clientedata.buscarClientePorDni(cliente.getDni()));
//        System.out.println(clientedata.buscarClientePorId(cliente.getIdCliente()));
//        clientedata.editarCliente(cliente);
//        clientedata.eliminarCliente(cliente.getIdCliente());
        Mascota mascota = new Mascota();
        MascotaData mascotaData = new MascotaData();
        mascota = mascotaData.buscarMascotaPorId(1);
        System.out.println(mascota.toString());
        VisitaData visita = new VisitaData();
        mascota.setPesoPromedio(visita.pesoPromedio(mascota.getIdMascota()));
        System.out.println(mascota.toString());
        mascotaData.editarMascota(mascota);
    }
    
}
