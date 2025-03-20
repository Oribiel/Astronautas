/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.astronautasnegocio;

import Entidades.AstronautaEntidad;

/**
 *
 * @author oribi
 */
public interface IAstronautaNegocio {
    void crearAstronauta(AstronautaEntidad astronauta);
    
    void guardar(AstronautaEntidad astronauta);
}
