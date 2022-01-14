package mx.com.tw.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.tw.domain.Contacto;
import mx.com.tw.domain.Domicilio;
import mx.com.tw.domain.Usuario;
import mx.com.tw.servicio.ServicioUsuario;

@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String calle = req.getParameter("calle");
        String noCalle = req.getParameter("noCalle");
        String pais = req.getParameter("pais");
        String email = req.getParameter("email");
        String telefono = req.getParameter("telefono");

        Domicilio dom = new Domicilio();
        dom.setCalle(calle);
        dom.setNoCalle(noCalle);
        dom.setPais(pais);

        Contacto contc = new Contacto();
        contc.setEmail(email);
        contc.setTelefono(telefono);

        Usuario usua = new Usuario();
        usua.setNombre(nombre);
        usua.setApellido(apellido);
        usua.setDomicilio(dom);
        usua.setContacto(contc);

        ServicioUsuario servUsu = new ServicioUsuario();
        servUsu.guardarUsuario(usua);

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
