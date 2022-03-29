package mx.com.tw.dao;

import mx.com.tw.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibrosDao extends JpaRepository<Libro, Long> {

}
