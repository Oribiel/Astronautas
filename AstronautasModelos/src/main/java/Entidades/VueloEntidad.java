/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
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
public class VueloEntidad implements Serializable {

   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   @Column(name= "id_Vuelo")
   private Long id;
   
   @Column(name= "numPasajeros")
   Integer numPasajeros;
   
   @Column(name="FechaHoraSalida")
   private LocalDateTime fechaHoraSalida;
   
   @ManyToOne
   @JoinColumn(name= "id_Nave", nullable= false)
   private NaveEntidad nave;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(Integer numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public NaveEntidad getNave() {
        return nave;
    }

    public void setNave(NaveEntidad nave) {
        this.nave = nave;
    }
   
   
}
