package mx.com.tw.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.tw.domain.Domicilio;

public class DomicilioDAO extends GenericDAO {

    public List<Domicilio> listar() {
        String consulta = "Select d From Domicilio d";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Domicilio domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(domicilio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    public void actualizar(Domicilio domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.merge(domicilio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    public void eliminar(Domicilio domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.remove(em.merge(domicilio));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    public Domicilio buscarPorId(Domicilio d) {
        em = getEntityManager();
        return em.find(Domicilio.class, d.getIdDomicilio());
    }
}
