package com.tw.BusquedaDinamica.service;

import com.concesionario.cochesbackend.criteria.CocheCriteria;

import io.github.jhipster.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.JoinType;
import java.util.List;
/*
@Service
@Transactional(readOnly = true)
public class CocheService extends QueryService<com.concesionario.cochesbackend.model.Computadora> {

    @Autowired
    CocheRepository cocheRepository;

    public List<com.concesionario.cochesbackend.model.Computadora> findByCriteria(CocheCriteria cocheCriteria){
        final Specification<com.concesionario.cochesbackend.model.Computadora> specification = createSpecification(cocheCriteria);
        List<com.concesionario.cochesbackend.model.Computadora> coches = cocheRepository.findAll(specification);
        return coches;
    }

    private Specification<com.concesionario.cochesbackend.model.Computadora> createSpecification(CocheCriteria criteria){
        Specification<com.concesionario.cochesbackend.model.Computadora> specification = Specification.where(null);
        if(criteria != null){
            if(criteria.getVersion()!=null){
                specification =
                        specification.and(buildStringSpecification(criteria.getVersion(), Coche_.version));
            }
            if(criteria.getColor()!=null){
                specification =
                        specification.and(buildSpecification(criteria.getColor(), Coche_.color));
            }
            if(criteria.getKm()!=null){
                specification =
                        specification.and(buildRangeSpecification(criteria.getKm(), Coche_.km));
            }
            if(criteria.getCambio()!=null){
                specification =
                        specification.and(buildSpecification(criteria.getCambio(), Coche_.cambio));
            }
            if(criteria.getModelo()!=null){
                specification =
                        specification
                                .and(buildReferringEntitySpecification(criteria.getModelo(), Coche_.modelo, Modelo_.nombre));
            }
            /*if(criteria.getModelo()!=null){
                specification =
                        specification.and(buildSpecification(criteria.getModelo(),
                                root -> root.join(Coche_.modelo, JoinType.LEFT).get(Modelo_.nombre)));
            }*//*
            if(criteria.getMarca()!=null){
                specification =
                        specification.and(buildSpecification(criteria.getMarca(),
                                root->root.join(Coche_.modelo, JoinType.LEFT)
                                        .join(Modelo_.marca, JoinType.LEFT).get(Marca_.nombre)));
            }
        }
        return specification;
    }
}
*/