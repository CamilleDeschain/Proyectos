package test;

import mx.com.tw.domain.Pelicula;
import mx.com.tw.dao.PeliculaDAO;

public class OperacionesHibJPA {

    public static void main(String[] args) {
        PeliculaDAO peliculaDao = new PeliculaDAO();
        peliculaDao.listar();

        Pelicula pelicula = new Pelicula();
//        pelicula.setIdPelicula(2);

//        pelicula = peliculaDao.buscarPeliculaporId(pelicula);
//        System.out.println("Persona encontrada = " + pelicula);
        pelicula.setNombre("Monstr Inc");
        pelicula.setCalificacion(8.5);
        pelicula.setFechaestreno("2003");
        pelicula.setGenero("animacion");

        peliculaDao.insertar(pelicula);
        // peliculaDao.modificar(pelicula);
//        peliculaDao.eliminar(pelicula);
        peliculaDao.listar();
    }
}
