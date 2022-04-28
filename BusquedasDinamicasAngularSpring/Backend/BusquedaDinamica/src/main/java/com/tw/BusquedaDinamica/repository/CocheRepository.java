package com.concesionario.cochesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CocheRepository extends JpaRepository<com.concesionario.cochesbackend.model.Equipo, Long>,
        JpaSpecificationExecutor<com.concesionario.cochesbackend.model.Equipo> {
}
