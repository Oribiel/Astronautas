/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "Muerte")
public class MuerteEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMuerte")
    private Long id;
    
    @Column(name = "fechaHoraMuerte" , nullable = false)
    private LocalDateTime fechaHoraMuerte;
    
    // RELACION 1 A 1 CON ASTRONAUTA
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idAstronauta",  nullable = false)
    private AstronautaEntidad astronauta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaHoraMuerte() {
        return fechaHoraMuerte;
    }

    public void setFechaHoraMuerte(LocalDateTime fechaHoraMuerte) {
        this.fechaHoraMuerte = fechaHoraMuerte;
    }
    
    
    
}
