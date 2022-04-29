package com.tw.BusquedaDinamica.service;


import com.tw.BusquedaDinamica.criteria.ComputadoraCriteria;
import com.tw.BusquedaDinamica.model.Computadora;
import com.tw.BusquedaDinamica.model.Computadora_;
import com.tw.BusquedaDinamica.model.Marca_;
import com.tw.BusquedaDinamica.model.Modelo_;
import com.tw.BusquedaDinamica.repository.ComputadoraRepository;
import io.github.jhipster.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.JoinType;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ComputadoraService extends QueryService<Computadora> {

    @Autowired
    ComputadoraRepository computadoraRepository;

    public List<Computadora> findByCriteria(ComputadoraCriteria computadoraCriteria){
        final Specification<Computadora> specification = createSpecification(computadoraCriteria);
        List<Computadora> computadoras = computadoraRepository.findAll(specification);
        return computadoras;
    }

    private Specification<Computadora> createSpecification(ComputadoraCriteria computadoraCriteria){
        Specification<Computadora> specification = Specification.where(null);
        if(computadoraCriteria != null){
            if(computadoraCriteria.getVersion()!=null){
                specification =
                        specification.and(buildStringSpecification(computadoraCriteria.getVersion(), Computadora_.version));
            }
            if(computadoraCriteria.getColor()!=null){
                specification =
                        specification.and(buildSpecification(computadoraCriteria.getColor(), Computadora_.color));
            }
            if(computadoraCriteria.getTamanoDisco()!=null){
                specification =
                        specification.and(buildRangeSpecification(computadoraCriteria.getTamanoDisco(), Computadora_.tamanoDisco));
            }
            if(computadoraCriteria.getCambio()!=null){
                specification =
                        specification.and(buildSpecification(computadoraCriteria.getCambio(), Computadora_.cambio));
            }
            if(computadoraCriteria.getModelo()!=null){
                specification =
                        specification
                                .and(buildReferringEntitySpecification(computadoraCriteria.getModelo(), Computadora_.modelo, Modelo_.nombre));
            }

            if(computadoraCriteria.getMarca()!=null){
                specification =
                        specification.and(buildSpecification(computadoraCriteria.getMarca(),
                                root->root.join(Computadora_.modelo, JoinType.LEFT)
                                        .join(Modelo_.marca, JoinType.LEFT).get(Marca_.nombre)));
            }
        }
        return specification;
    }
}
