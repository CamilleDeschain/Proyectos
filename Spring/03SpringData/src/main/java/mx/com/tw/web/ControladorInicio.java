package mx.com.tw.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.tw.dao.ILibrosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private ILibrosDao iLibrosDao;

    @GetMapping("/")
    public String inicio(Model model) {
        var libros = iLibrosDao.findAll();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("libros",libros);
        return "index";
    }
}
