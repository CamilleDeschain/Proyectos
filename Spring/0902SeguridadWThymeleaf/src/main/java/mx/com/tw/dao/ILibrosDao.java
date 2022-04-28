package mx.com.tw.dao;

import mx.com.tw.domain.Libro;
import org.springframework.data.repository.CrudRepository;

public interface ILibrosDao extends CrudRepository<Libro, Long> {

}
