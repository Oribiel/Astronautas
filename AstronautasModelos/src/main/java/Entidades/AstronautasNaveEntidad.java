/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author oribi
 */
@Entity
public class AstronautasNaveEntidad implements Serializable {

   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private Long id;
   
   @ManyToOne
   @JoinColumn(name= "id_astronauta", nullable= false)
   private AstronautaEntidad astronauta;
   
   @ManyToOne
   @JoinColumn(name= "id_Nave", nullable= false)
   private NaveEntidad nave;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AstronautaEntidad getAstronauta() {
        return astronauta;
    }

    public void setAstronauta(AstronautaEntidad astronauta) {
        this.astronauta = astronauta;
    }

    public NaveEntidad getNave() {
        return nave;
    }

    public void setNave(NaveEntidad nave) {
        this.nave = nave;
    }
   
   
    
}
