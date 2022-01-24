package mx.com.tw.servicio;

import java.util.List;
import mx.com.tw.domain.Persona;


public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);
    

    public Persona encontrarPersona(Persona persona);
}
