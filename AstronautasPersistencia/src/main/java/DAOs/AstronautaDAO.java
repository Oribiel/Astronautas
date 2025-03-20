/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Entidades.AstronautaEntidad;
import Entidades.AstronautasNaveEntidad;
import Entidades.MuerteEntidad;
import Entidades.NaveEntidad;
import Entidades.VueloEntidad;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
 
    public void guardar(AstronautaEntidad astronauta){


            // Crear un administrador de entidades a partir de la fabrica
            EntityManager em = emf.createEntityManager();

            // Iniciar una nueva transaccion
            em.getTransaction().begin();


            AstronautaEntidad astro1 = new AstronautaEntidad("Ori", "Beltran", "Quevedo",30,"masculino","mex","A+");
            AstronautaEntidad astro2 = new AstronautaEntidad("Jack", "Murrieta", "Quevedo",22,"masculino","mex","B+");
            
            MuerteEntidad muerte = new MuerteEntidad(Calendar.getInstance(),astro2);
            
            NaveEntidad nave = new NaveEntidad("Falcon", "Rojo", "Mexico", 2,"Grande");
            
            List<VueloEntidad> vuelos = new ArrayList<>();
            VueloEntidad vuelo1 = new VueloEntidad(2,nave);
            VueloEntidad vuelo2 = new VueloEntidad(1,nave);
            VueloEntidad vuelo3 = new VueloEntidad(1,nave);
            VueloEntidad vuelo4 = new VueloEntidad(2,nave);
            VueloEntidad vuelo5 = new VueloEntidad(1,nave);
            
            vuelo1.setFechaHoraSalida(Calendar.getInstance());
            vuelo2.setFechaHoraSalida(Calendar.getInstance());
            vuelo3.setFechaHoraSalida(Calendar.getInstance());
            vuelo4.setFechaHoraSalida(Calendar.getInstance());
            vuelo5.setFechaHoraSalida(Calendar.getInstance());
            
            vuelos.add(vuelo1);
            vuelos.add(vuelo2);
            vuelos.add(vuelo3);
            vuelos.add(vuelo4);
            vuelos.add(vuelo5);
            
            nave.setVuelo(vuelos);
            
            astro2.setMuerte(muerte);
            
            List<AstronautasNaveEntidad> astroNaves = new ArrayList<>();
            
            AstronautasNaveEntidad an = new AstronautasNaveEntidad(astro1,nave);
            AstronautasNaveEntidad an2 = new AstronautasNaveEntidad(astro2,nave);
            
            astroNaves.add(an);
            astroNaves.add(an2);
            
            astro1.setDestino(astroNaves);
            astro2.setDestino(astroNaves);
            nave.setDestino(astroNaves);
            
            em.persist(astro1);
            em.persist(astro2);
            em.persist(nave);

            // Confirmar la transaccion para que los cambios se apliquen
            em.getTransaction().commit();

            // Mostrar mensaje de exito
            System.out.println("Operacio realizada correctamente");

            // Cerrar el administrador de entidades y la fabrica
            em.close();
            emf.close();
        }
}
