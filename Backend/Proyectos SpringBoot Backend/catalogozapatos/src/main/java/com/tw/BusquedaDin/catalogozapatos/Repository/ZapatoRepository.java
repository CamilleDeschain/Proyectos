package com.tw.BusquedaDin.catalogozapatos.Repository;

import com.tw.BusquedaDin.catalogozapatos.Model.Zapato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ZapatoRepository extends JpaRepository<Zapato,Long>, JpaSpecificationExecutor {
}
