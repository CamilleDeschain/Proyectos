package com.tw.BusquedaDinamica.repository;
import com.tw.BusquedaDinamica.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
