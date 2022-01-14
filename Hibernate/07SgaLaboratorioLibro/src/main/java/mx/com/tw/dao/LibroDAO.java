package mx.com.tw.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.tw.domain.Libro;

public class LibroDAO extends GenericDAO {

    public List<Libro> listar() {
        String consulta = "Select d From Libro d";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Libro libro) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(libro);
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

    public void actualizar(Libro libro) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.merge(libro);
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

    public void eliminar(Libro libro) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.remove(em.merge(libro));
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

    public Libro buscarPorId(Libro d) {
        em = getEntityManager();
        return em.find(Libro.class, d.getLibro());

    }
}
