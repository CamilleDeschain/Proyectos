package com.tw.BusquedaDinamica.repository;

import com.tw.BusquedaDinamica.model.Computadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ComputadoraRepository extends JpaRepository<Computadora, Long>,
        JpaSpecificationExecutor<Computadora> {
}
