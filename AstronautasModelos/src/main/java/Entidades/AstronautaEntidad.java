/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jack Murrieta
 */
@Entity
@Table(name = "Astronauta")
public class AstronautaEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAstronauta")
    private Long id;
    
    @Column(name = "nombres", length = 70, nullable = false)
    private String nombres;

    @Column(name = "apellidoPaterno", length = 35, nullable = false)
    private String paterno;

    @Column(name = "apellidoMaterno", length = 35, nullable = true)
    private String materno;
    
    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "sexo", length = 15, nullable = false)
    private String sexo;

    @Column(name = "pais", length = 35, nullable = false)
    private String pais;
    
    @Column(name="sangre", length = 5, nullable = false)
    private String sangre;
    
    //RELACION MUERTE 
    @OneToOne(mappedBy = "astronauta")
    private MuerteEntidad muerte;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AstronautaEntidad)) {
            return false;
        }
        AstronautaEntidad other = (AstronautaEntidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.AstronautaEntidad[ id=" + id + " ]";
    }
    
}
