package mx.com.tw.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.tw.domain.Usuario;
import mx.com.tw.servicio.ServicioUsuario;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServicioUsuario servicioUsuario = new ServicioUsuario();

        List<Usuario> usuarios = servicioUsuario.listarUsuario();

        req.setAttribute("usuarios", usuarios);
        try {
            req.getRequestDispatcher("/WEB-INF/listarUsuarios.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
