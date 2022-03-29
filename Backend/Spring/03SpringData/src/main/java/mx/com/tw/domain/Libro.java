package mx.com.tw.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "libro")
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idLibro;
    private String nombrelibro;
    private String autor;
    private String editorial;
    private double costo;

}
