package mx.com.tw;

import lombok.extern.slf4j.Slf4j;
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
        model.addAttribute("saludar", saludar);
        
        
        model.addAttribute("SaludoX",SaludoX);
        return "index";
    }
}
