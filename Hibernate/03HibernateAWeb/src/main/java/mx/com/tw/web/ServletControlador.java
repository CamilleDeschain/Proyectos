package mx.com.tw.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.tw.domain.Pelicula;
import mx.com.tw.servicio.ServicioPeliculas;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServicioPeliculas servPels =new ServicioPeliculas();
        List<Pelicula> peliculas=servPels.listarPeliculas();
        
        req.setAttribute("peliculas", peliculas);
        
        try{
            req.getRequestDispatcher("/WEB-INF/listado.jsp").forward(req, resp);
        }
        catch(ServletException ex){
            ex.printStackTrace(System.out);
        }catch(IOException ex){
           ex.printStackTrace(System.out); 
        }
    }
}
