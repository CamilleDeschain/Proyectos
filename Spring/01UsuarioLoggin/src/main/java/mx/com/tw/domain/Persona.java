package mx.com.tw.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity

@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long idPersona;

    private String nombre;
    private String apellido;
    private String email;
    private String preguntasecreta;
    private String user;
    private String password;
    private String confpass;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, String preguntasecreta, String user, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.preguntasecreta = preguntasecreta;
        this.user = user;
        this.password = password;
        this.confpass = confpass;
    }

    public Persona(String user, String password, String confpass) {
        this.user = user;
        this.password = password;
        this.confpass = confpass;
    }

    public Persona(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreguntasecreta() {
        return preguntasecreta;
    }

    public void setPreguntasecreta(String preguntasecreta) {
        this.preguntasecreta = preguntasecreta;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfpass() {
        return confpass;
    }

    public void setConfpass(String confpass) {
        this.confpass = confpass;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idPersona);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apellido);
        hash = 23 * hash + Objects.hashCode(this.email);
        hash = 23 * hash + Objects.hashCode(this.preguntasecreta);
        hash = 23 * hash + Objects.hashCode(this.user);
        hash = 23 * hash + Objects.hashCode(this.password);
        hash = 23 * hash + Objects.hashCode(this.confpass);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.preguntasecreta, other.preguntasecreta)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.confpass, other.confpass)) {
            return false;
        }
        return Objects.equals(this.idPersona, other.idPersona);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", preguntasecreta=").append(preguntasecreta);
        sb.append(", user=").append(user);
        sb.append(", password=").append(password);
        sb.append(", confpass=").append(confpass);
        sb.append('}');
        return sb.toString();
    }

}
