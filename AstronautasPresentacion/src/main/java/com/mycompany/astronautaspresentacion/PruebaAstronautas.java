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
       // Crear instancia del DAO
        IAstronautaDAO astronautaDAO = new AstronautaDAO();

        // Crear instancia del BO
        IAstronautaNegocio astronautaNegocio = new AstronautaNegocio(astronautaDAO);

        // Crear nuevo astronauta
        AstronautaEntidad astronauta = new AstronautaEntidad();
        astronauta.setNombres("Ori");
        astronauta.setMaterno("Arr");
        astronauta.setPaterno("Beltran");
        astronauta.setEdad(20);
        astronauta.setSexo("Masculino");
        astronauta.setPais("Mexico");
        astronauta.setTipoSangre("O+");

        // Llamar al negocio para crear astronauta
        astronautaNegocio.crearAstronauta(astronauta);
    }
}
