package mx.com.tw.test;

import javax.persistence.*;
import mx.com.tw.domain.Contacto;
import mx.com.tw.domain.Domicilio;
import mx.com.tw.domain.Usuario;

public class PersistenciaCascadaTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        Domicilio dom = new Domicilio();
        dom.setCalle("valle frio");
        dom.setNoCalle("no 6");
        dom.setPais("Mexico");
        
        Contacto cont = new Contacto();
        cont.setEmail("asd@gmail.com");
        cont.setTelefono("4444444444");
        
        Usuario useR = new Usuario();
        useR.setApellido("Gutierrez");
        useR.setNombre("fernando");
        useR.setDomicilio(dom);
        useR.setContacto(cont);
        
        em.getTransaction().begin();
        em.persist(useR);
        em.getTransaction().commit();
        
        System.out.println("useR = " + useR);
    }
}
