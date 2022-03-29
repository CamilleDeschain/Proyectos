package mx.com.tw.dao;

import mx.com.tw.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Long> {

//    Usuario findByUsername(String username);
}
