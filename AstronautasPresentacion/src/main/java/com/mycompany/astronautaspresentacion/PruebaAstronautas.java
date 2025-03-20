/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.astronautaspresentacion;

import DAOs.AstronautaDAO;
import DAOs.IAstronautaDAO;
import Entidades.AstronautaEntidad;
import com.mycompany.astronautasnegocio.AstronautaNegocio;
import com.mycompany.astronautasnegocio.IAstronautaNegocio;

/**
 *
 * @author oribi
 */
public class PruebaAstronautas {

    public static void main(String[] args) {
       
        IAstronautaDAO astronautaDAO = new AstronautaDAO();

        
        IAstronautaNegocio astronautaNegocio = new AstronautaNegocio(astronautaDAO);

        AstronautaEntidad astronauta = new AstronautaEntidad();
        astronauta.setNombres("Ori");
        astronauta.setMaterno("Arr");
        astronauta.setPaterno("Beltran");
        astronauta.setEdad(20);
        astronauta.setSexo("Masculino");
        astronauta.setPais("Mexico");
        astronauta.setTipoSangre("O+");

      
        astronautaNegocio.crearAstronauta(astronauta);
    }
}
