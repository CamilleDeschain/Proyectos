package mx.com.tw.dao;

import javax.persistence.*;

public abstract class GenericDAO {

    protected static EntityManager em;

    protected static EntityManagerFactory emf;

    protected static final String PU = "HibernateJpaPU";

    public GenericDAO() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PU);
        }
    }

    protected EntityManager getEntityManager() {
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }

}
