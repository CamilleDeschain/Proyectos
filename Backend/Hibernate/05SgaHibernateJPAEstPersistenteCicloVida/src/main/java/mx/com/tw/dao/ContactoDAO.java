package mx.com.tw.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.tw.domain.Contacto;

public class ContactoDAO extends GenericDAO {

    public List<Contacto> listar() {
        String consulta = "Select d From Contacto d";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.persist(contacto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void actualizar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.merge(contacto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.remove(em.merge(contacto));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Object buscarPorId(Contacto d) {
        em = getEntityManager();
        return em.find(Contacto.class, d.getIdContacto());
    }
}
