package mx.com.tw.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mx.com.tw.domain.Contacto;
import mx.com.tw.domain.Domicilio;
import mx.com.tw.domain.Usuario;
import mx.com.tw.servicio.ServicioUsuario;

@WebServlet("/ServletModif")
public class ServletModificar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idUsuarioS = req.getParameter("idUsuario");
        Integer idUsuario = Integer.parseInt(idUsuarioS);

        Usuario usuario = new Usuario();
        usuario.setIdUsuario(idUsuario);

        ServicioUsuario servUsuario = new ServicioUsuario();
        usuario = servUsuario.encontrarPorId(usuario);

        //req.setAttribute("usuario", usuario);
        HttpSession sesion = req.getSession();
        sesion.setAttribute("usuario", usuario);
        req.getRequestDispatcher("/WEB-INF/modificarUsuarios.jsp").forward(req, resp);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServicioUsuario servicioUsua = new ServicioUsuario();
        String modificar = req.getParameter("Modificar");
        if (modificar != null) {
            String nombre = req.getParameter("nombre");
            String apellido = req.getParameter("apellido");
            String calle = req.getParameter("calle");
            String noCalle = req.getParameter("noCalle");
            String pais = req.getParameter("pais");
            String email = req.getParameter("email");
            String telefono = req.getParameter("telefono");

            HttpSession sesion = req.getSession();
            Usuario usua = (Usuario) sesion.getAttribute("usuario");

            usua.setNombre(nombre);
            usua.setApellido(apellido);

            usua.getDomicilio().setCalle(calle);
            usua.getDomicilio().setNoCalle(noCalle);
            usua.getDomicilio().setPais(pais);

            usua.getContacto().setEmail(email);
            usua.getContacto().setTelefono(telefono);

            ServicioUsuario servUsu = new ServicioUsuario();
            servUsu.guardarUsuario(usua);

            sesion.removeAttribute("usuario");
        } else {
            String idUsuarioS = req.getParameter("idUsuario");
            Integer idUsuario = Integer.parseInt(idUsuarioS);
            Usuario usuario = new Usuario(idUsuario);
            servicioUsua.eliminarUsuario(usuario);

        }
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
