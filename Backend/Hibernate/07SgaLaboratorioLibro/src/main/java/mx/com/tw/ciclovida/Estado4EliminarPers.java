package mx.com.tw.ciclovida;

import javax.persistence.*;
import mx.com.tw.domain.Contacto;

public class Estado4EliminarPers {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em=emf.createEntityManager();
        //definimos variable 
        Contacto contacto =null;
        
        //recuperamos objeto
        //1.trasitivo
        contacto=em.find(Contacto.class, 2);
        
        //Modificamos objeto
        contacto.setEmail("1234@gmail.com");
        
        em.getTransaction().begin();
        
        //2.persistente (.merge tmb se puede utilizar )
        em.remove(em.merge(contacto));
        em.getTransaction().commit();
        
        //detached
        System.out.println("contacto = " + contacto);
    }
}
