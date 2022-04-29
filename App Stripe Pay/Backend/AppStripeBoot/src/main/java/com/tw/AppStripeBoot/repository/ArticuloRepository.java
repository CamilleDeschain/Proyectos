package com.tw.AppStripeBoot.repository;


import com.tw.AppStripeBoot.model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
    Optional<Articulo> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
}
