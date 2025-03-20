/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astronautasnegocio;

import DAOs.IAstronautaDAO;
import Entidades.AstronautaEntidad;

/**
 *
 * @author oribi
 */
public class AstronautaNegocio implements IAstronautaNegocio {
  
    private IAstronautaDAO astronautaDAO;
    
      public AstronautaNegocio(IAstronautaDAO astronautaDAO) {
        this.astronautaDAO = astronautaDAO;
    }
      
      
    public void crearAstronauta(AstronautaEntidad astronauta) {
       //Logica de negocio iria aqui 
        
        astronautaDAO.crearAstronauta(astronauta);
    }  
    
    public void guardar(AstronautaEntidad astronauta){
        astronautaDAO.guardar(astronauta);
    }
}
