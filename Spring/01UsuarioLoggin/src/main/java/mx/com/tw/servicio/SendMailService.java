package mx.com.tw.servicio;

import mx.com.tw.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {

    @Autowired
    private JavaMailSender javamailSender;

    public void SendMailService(Persona persona) {
        SimpleMailMessage mailMsg = new SimpleMailMessage();

        mailMsg.setTo(persona.getEmail());
        mailMsg.setText("confirma tu email :" + "http://localhost:8080/confirmPassword/" + persona.getIdPersona());

        javamailSender.send(mailMsg);
    }
}
