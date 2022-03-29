package mx.com.tw.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.tw.dao.ILibrosDao;
import mx.com.tw.domain.Libro;
import mx.com.tw.servicio.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private LibroService libroService;

    @GetMapping("/")
    public String inicio(Model model) {
        var libros = libroService.listarLibros();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("libros", libros);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Libro libro) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Libro libro) {
        libroService.guardar(libro);
        return "redirect:/";
    }

    @GetMapping("/editar/{idLibro}")
    public String editar(Libro libro, Model model) {
        libro = libroService.encontrarLibro(libro);
        model.addAttribute("libro", libro);
        return "modificar";
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
