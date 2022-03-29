package mx.com.tw.ciclovida;

import javax.persistence.*;
import mx.com.tw.domain.Contacto;

public class Estado2RecuperarPers {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em=emf.createEntityManager();
        //definimos variable 
        Contacto contacto =null;
        em.getTransaction().begin();
        //recuperamos el objeto 
        contacto= em.find(Contacto.class, 2);
        //detached
        System.out.println("contacto = " + contacto);
        
    }
}
