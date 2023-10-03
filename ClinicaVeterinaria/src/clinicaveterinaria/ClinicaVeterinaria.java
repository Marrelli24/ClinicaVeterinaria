/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import AccesoADatos.ClienteData;
import Entidades.Cliente;

/**
 *
 * @author Ezequiel
 */
public class ClinicaVeterinaria {

    public static void main(String[] args) {
       
        
        //Pruebas de Tratamiento
        TratamientoData trat = new TratamientoData();
        
        System.out.println(trat.buscarTratamiento(1));
        
        
        
        ClienteData clientedata= new ClienteData();
        Cliente cliente = new Cliente(38299859, "Ezequiel", "Marrelli", 44, "Calle solari", 1);
    }
    
}
