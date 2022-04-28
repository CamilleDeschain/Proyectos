package mx.com.tw.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "libro")
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;

    @NotEmpty
    private String nombrelibro;
    @NotEmpty
    private String autor;
    @NotEmpty
    private String editorial;
    @NotNull
    private double costo;

}
