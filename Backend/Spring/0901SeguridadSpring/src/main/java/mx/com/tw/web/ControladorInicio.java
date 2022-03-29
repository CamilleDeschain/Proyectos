package mx.com.tw.web;

import javax.validation.*;
import lombok.extern.slf4j.Slf4j;
import mx.com.tw.dao.ILibrosDao;
import mx.com.tw.domain.Libro;
import mx.com.tw.servicio.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private LibroService libroService;

    @GetMapping("/")
    public String inicio(Model model,@AuthenticationPrincipal User user) {
        
        
        var libros = libroService.listarLibros();
        log.info("ejecutando el controlador Spring MVC");
        log.info("usuario hizo login: " + user);
        model.addAttribute("libros", libros);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Libro libro) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Libro libro, Errors errors) {
        if(errors.hasErrors()){
            return "modificar";
        }
        libroService.guardar(libro);
        return "redirect:/";
    }

//    @GetMapping("/eliminar/{idLibro}")
//    public String eliminar(Libro libro) {
//        libroService.eliminar(libro);
//        return "redirect:/";
//    }
    @GetMapping("/eliminar")
    public String eliminar(Libro libro) {
        libroService.eliminar(libro);
        return "redirect:/";
    }
}
