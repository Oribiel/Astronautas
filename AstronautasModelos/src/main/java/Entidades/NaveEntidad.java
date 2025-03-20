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

/**
 *
 * @author oribi
 */
@Entity
public class NaveEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNave") //Con el column Se crea el como se llamara el atributo en mi bd
    private Long id;
    
    @Column(name= "Nombre")
    private String nombre;
    
    @Column(name= "Color")
    private String color;
    
    @Column(name= "Pais")
    private String pais;
    
    @Column(name= "numeroPasajeros")
    Integer numPasajeros;
    
    @Column(name="tamanio")
    String tamanío;
    
    @OneToMany(mappedBy= "nave", cascade= CascadeType.PERSIST)
    private List<AstronautasNaveEntidad> destino;
    
    @OneToMany(mappedBy="nave", cascade= CascadeType.PERSIST)
    private List<VueloEntidad> vuelo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NaveEntidad() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(Integer numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getTamanío() {
        return tamanío;
    }

    public void setTamanío(String tamanío) {
        this.tamanío = tamanío;
    }

    public List<AstronautasNaveEntidad> getDestino() {
        return destino;
    }

    public void setDestino(List<AstronautasNaveEntidad> destino) {
        this.destino = destino;
    }

    public List<VueloEntidad> getVuelo() {
        return vuelo;
    }

    public void setVuelo(List<VueloEntidad> vuelo) {
        this.vuelo = vuelo;
    }

    

    
    
    
    
}
