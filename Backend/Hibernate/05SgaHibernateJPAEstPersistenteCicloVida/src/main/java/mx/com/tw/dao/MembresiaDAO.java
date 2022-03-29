
package mx.com.tw.dao;

import java.util.List;
import javax.persistence.Query;
import mx.com.tw.domain.Membresia;

public class MembresiaDAO extends GenericDAO {

    public List<Membresia> listar() {
        String consulta = "Select d From Membresia d";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Membresia membresia) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.persist(membresia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void actualizar(Membresia membresia) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.merge(membresia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Membresia membresia) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.remove(em.merge(membresia));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Object buscarPorId(Membresia d) {
        em = getEntityManager();
        return em.find(Membresia.class, d.getIdMembresia());
    }
}
