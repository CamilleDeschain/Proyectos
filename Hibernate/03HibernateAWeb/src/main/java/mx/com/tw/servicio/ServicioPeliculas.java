
package mx.com.tw.servicio;

import java.util.List;
import mx.com.tw.dao.PeliculaDAO;
import mx.com.tw.domain.Pelicula;

public class ServicioPeliculas {
    private PeliculaDAO peliculaDao;
    public ServicioPeliculas(){
        this.peliculaDao=new PeliculaDAO();
    }
    
    public List<Pelicula> listarPeliculas(){
        return this.peliculaDao.listar();
    }
}
