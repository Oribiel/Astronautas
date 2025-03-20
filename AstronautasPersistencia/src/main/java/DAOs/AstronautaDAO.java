/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Entidades.AstronautaEntidad;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author oribi
 */
public class AstronautaDAO implements IAstronautaDAO{
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("AstronautasPU");
    
    public void crearAstronauta(AstronautaEntidad astronauta) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(astronauta);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
