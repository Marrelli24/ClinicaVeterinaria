package clinicaveterinaria;

import AccesoADatos.ClienteData;
import AccesoADatos.MascotaData;
import Entidades.Cliente;
import AccesoADatos.TratamientoData;
import AccesoADatos.VisitaData;
import Entidades.Mascota;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class ClinicaVeterinaria {
/*
    public static void main(String[] args) {
        ClienteData clientedata = new ClienteData();
        MascotaData mascotaData = new MascotaData();
        VisitaData visitadata = new VisitaData();
        TratamientoData trata = new TratamientoData();

        //Pruebas de Tratamiento
        TratamientoData trat = new TratamientoData();

       // System.out.println(trat.buscarTratamiento(1));

// 1) CLIENTE Y CLIENTE DATA
       // Cliente cliente = new Cliente();
       //clientedata.guardarCliente(cliente);
   //    cliente = clientedata.buscarClientePorDni(8584598);
    //    System.out.println(clientedata.buscarClientePorId(cliente.getIdCliente()));
    //    cliente.setNombre("Albert");
      //  clientedata.editarCliente(cliente);
       for (Cliente cliente2 : clientedata.listarClientes()) {
            System.out.println(cliente2.toString());
        }
      //  clientedata.eliminarCliente(cliente.getIdCliente());
//
//
//
//        2)MASCOTA Y MASCOTA DATA (Visita crear y peso promedio)
//        Mascota mascota = new Mascota();
//        LocalDate fecha = LocalDate.of(2022, Month.MARCH, 23);
//        Mascota mascota2 = new Mascota("Salchicha", "Macho", "Perro", "Salchicha", "Negro", fecha, clientedata.buscarClientePorId(1));
//        mascotaData.guardarMascota(mascota2);      
//        Mascota mascota2 = new Mascota();
//        mascota2 = mascotaData.buscarMascotaPorId(5);
//        
//        Tratamiento tratamiento = new Tratamiento();
//        tratamiento = trata.buscarTratamiento(1);
//        
//        Visita visita = new Visita(mascota2, fecha, "Baño", 5.10, tratamiento);
//        visitadata.guardarVisita(visita);
//        mascota2.setPesoActual(visita.getPeso());
//        mascota2.setPesoPromedio(visitadata.pesoPromedio(mascota2.getIdMascota()));
//        mascotaData.editarMascota(mascota2);
//        
//        for (Mascota mascotita : mascotaData.listarMascotas()) {
//            System.out.println(mascotita.toString());
//        }
//        for (Mascota mascotita : mascotaData.buscarMascotaPorCliente(1)) {
//            System.out.println(mascotita.toString());
//        }
//
//
//
//
//       3)Tratamientos
//Guardar
//        Tratamiento tratamiento = new Tratamiento("Vacunacion", "Vacunacion", "Inyeccion", 15000, true);
//        trata.guardarTratamiento(tratamiento);
//Editar, buscar y alta/baja
//        Tratamiento tratamiento = new Tratamiento();
//        tratamiento = trata.buscarTratamiento(3);
//        tratamiento.setPrecio(17000);
//        trata.editarTratamiento(tratamiento);
//        trata.altaOBajaTratamiento(tratamiento);
//Visita
//        Visita visita = new Visita();
//        visita = visitadata.buscarVisitaPorId(7);
////        visita.setPeso(7.500);
////        visitadata.editarVisita(visita);
////        System.out.println(visita)
//      
//
//        for( Visita visita1 : visitadata.buscarVisitaPorTratamiento(2)){
//            System.out.println(visita1.toString());}
//    for(Mascota mascota:mascotaData.listarMascotasPorTratamiento(1)){
//        System.out.println(mascota.toString());
//        }
//        System.out.println(mascota.toString());
//        mascota = mascotaData.buscarMascotaPorId(1);
//        mascota.setPesoPromedio(visitadata.pesoPromedio(mascota.getIdMascota()));
//        System.out.println(mascota.toString());
//        mascotaData.editarMascota(mascota);
    }
*/
}
