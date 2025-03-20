/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    private Integer edad;

    @Column(name = "sexo", length = 15, nullable = false)
    private String sexo;

    @Column(name = "pais", length = 35, nullable = false)
    private String pais;
    
    @Column(name="tipoSangre", length = 5, nullable = false)
    private String tipoSangre;
    
    //RELACION MUERTE 
    @OneToOne(mappedBy = "astronauta")
    private MuerteEntidad muerte;
    
    @OneToMany(mappedBy= "astronauta", cascade= CascadeType.PERSIST)
    private List<AstronautasNaveEntidad> destino;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public MuerteEntidad getMuerte() {
        return muerte;
    }

    public void setMuerte(MuerteEntidad muerte) {
        this.muerte = muerte;
    }

    public List<AstronautasNaveEntidad> getDestino() {
        return destino;
    }

    public void setDestino(List<AstronautasNaveEntidad> destino) {
        this.destino = destino;
    }
    
    
   
}
