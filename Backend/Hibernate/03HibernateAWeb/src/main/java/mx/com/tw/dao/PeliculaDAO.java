package mx.com.tw.dao;

import mx.com.tw.domain.Pelicula;
import javax.persistence.*;
import java.util.List;

public class PeliculaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PeliculaDAO() {
        emf = Persistence.createEntityManagerFactory("HibPU");
        em = emf.createEntityManager();
    }

    public List<Pelicula> listar() {
        String hql = "SELECT p FROM Pelicula p";
        Query query = em.createQuery(hql);
        List<Pelicula> peliculas = query.getResultList();
//        for (Pelicula p : peliculas) {
//            System.out.println("peliculas XD = " + p);
//        }
        return peliculas;
    }

    public void insertar(Pelicula pelicula) {
        try {
            em.getTransaction().begin();
            em.persist(pelicula);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
//        finally{
//            if(em != null){
//                em.close();
//            }
//        }
    }

    public void modificar(Pelicula pelicula) {
        try {
            em.getTransaction().begin();
            em.merge(pelicula);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
//        finally{
//            if(em != null){
//                em.close();
//            }
//        }
    }

    public Pelicula buscarPeliculaporId(Pelicula p) {
        return em.find(Pelicula.class, p.getIdPelicula());
    }

    public void eliminar(Pelicula pelicula) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(pelicula));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
//        finally{
//            if(em != null){
//                em.close();
//            }
//        }
    }
}
