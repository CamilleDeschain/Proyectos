package mx.com.tw.domain;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="peliculas")
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id_peliculas")
    @Id
    private int idPelicula;
    private String nombre;
    private String fechaestreno;
    private String genero;
    private double calificacion;

    public Pelicula() {
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaestreno() {
        return fechaestreno;
    }

    public void setFechaestreno(String fechaestreno) {
        this.fechaestreno = fechaestreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{");
        sb.append("idPelicula=").append(idPelicula);
        sb.append(", nombre=").append(nombre);
        sb.append(", fechaestreno=").append(fechaestreno);
        sb.append(", genero=").append(genero);
        sb.append(", calificacion=").append(calificacion);
        sb.append('}');
        return sb.toString();
    }

}
