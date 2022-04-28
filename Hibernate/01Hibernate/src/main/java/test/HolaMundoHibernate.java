package test;

import domain.Pelicula;
import jakarta.persistence.*;
import java.util.List;


public class HolaMundoHibernate {

    public static void main(String[] args) {
        String hql = "SELECT p FROM Pelicula p";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Hibernate01");
        EntityManager entityManager = fabrica.createEntityManager();

        Query query = entityManager.createQuery(hql);
        List<Pelicula> peliculas = query.getResultList();
        for (Pelicula p : peliculas) {
            System.out.println("Peliculas = " + p);
        }
    }
}
