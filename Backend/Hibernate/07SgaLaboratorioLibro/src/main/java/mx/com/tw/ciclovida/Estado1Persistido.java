package mx.com.tw.ciclovida;

import javax.persistence.*;
import mx.com.tw.domain.Contacto;

public class Estado1Persistido {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em=emf.createEntityManager();
        
        //1.estado transitivo
        Contacto contacto =new Contacto();
        contacto.setEmail("aaa");
        contacto.setTelefono("2222222222");
        
        
        //2.persistimos el objeto 
        em.getTransaction().begin();
        
        em.persist(contacto);
        contacto.getIdContacto();
  
        em.getTransaction().commit();
        
        //3.detaches (Seprado de la base de datos )
        System.out.println("contacto = " + contacto);
        
    }
}
