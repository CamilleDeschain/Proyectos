package mx.com.tw.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.tw.domain.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import mx.com.tw.servicio.SendMailService;
import org.springframework.web.bind.annotation.PostMapping;
import mx.com.tw.servicio.PersonaService;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model) {
        return "index";
    }

    @GetMapping("/agregar")
    public String agregarPersona(Persona persona) {
        return "/modificar";
    }

    @Autowired
    private SendMailService sendmailServ;

    @PostMapping("/guardar")
    public String enviarCorreo(Persona persona) {
        personaService.guardar(persona);
        sendmailServ.SendMailService(persona);
        return "redirect:/";
    }

    @GetMapping("confirmPassword/{idUsuario}")
    public String confirmarUser(Persona persona, Model modelo) {
        persona = personaService.encontrarPersona(persona);
        modelo.addAttribute("persona", persona);
        return "/modificarPassC";
    }

    @PostMapping("/guardarpassC")
    public String guardarConfirmacion(Persona persona) {
        personaService.guardar(persona);
        return null;
    }

    @PostMapping("/logeo")
    public String logeo(Persona persona, String us1, String pas1) {
        personaService.guardar(persona);
        sendmailServ.SendMailService(persona);
        return "redirect:/";
    }

}
