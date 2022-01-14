
package mx.com.tw.dao;

import java.util.List;
import javax.persistence.Query;
import mx.com.tw.domain.Usuario;

public class UsuarioDAO extends GenericDAO {

    public List<Usuario> listar() {
        String consulta = "Select d From Usuario d";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Usuario usuario) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(usuario);
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

    public void actualizar(Usuario usuario) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.merge(usuario);
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

    public void eliminar(Usuario usuario) {
        try {
            em = getEntityManager();
            em.getTransaction();
            em.remove(em.merge(usuario));
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

    public Usuario buscarPorId(Usuario d) {
        em = getEntityManager();
        return em.find(Usuario.class, d.getIdUsuario());
    }
}