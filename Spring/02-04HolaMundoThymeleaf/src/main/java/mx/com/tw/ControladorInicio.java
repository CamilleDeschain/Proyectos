package mx.com.tw;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import mx.com.tw.domain.Libro;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String SaludoX;

    @GetMapping("/")
    public String inicio(Model model) {
        var saludar = "Hola Mundo con Thymeleaf";
        log.info("ejecutando controlador Spring MVC");

        var libro1 = new Libro();
        libro1.setNombre("Harry Potter");
        libro1.setAutor("JK");
        libro1.setEditorial("NA");
        libro1.setCosto(200.00);

        var libro2 = new Libro();
        libro2.setNombre("Harry aa");
        libro2.setAutor("g");
        libro2.setEditorial("d");
        libro2.setCosto(23.00);

        var libro3 = new Libro();
        libro3.setNombre("Harry ss");
        libro3.setAutor("ss");
        libro3.setEditorial("dd");
        libro3.setCosto(12.00);
        //var p=new ArrayList();
        //p.add(libro1);
//        var libros = Arrays.asList(libro1, libro2, libro3);
        var libros = new ArrayList();

        model.addAttribute("saludar", saludar);

        model.addAttribute("SaludoX", SaludoX);

        model.addAttribute("libros", libros);
        
    
        return "index";
    }
}
