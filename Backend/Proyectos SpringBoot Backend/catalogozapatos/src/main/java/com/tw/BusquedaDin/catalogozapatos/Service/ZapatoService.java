package com.tw.BusquedaDin.catalogozapatos.Service;


import com.tw.BusquedaDin.catalogozapatos.Criteria.ZapatoCriteria;
import com.tw.BusquedaDin.catalogozapatos.Model.*;
import com.tw.BusquedaDin.catalogozapatos.Repository.ZapatoRepository;
import io.github.jhipster.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.JoinType;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ZapatoService extends QueryService<Zapato> {
    @Autowired
    private ZapatoRepository zapatoRepository;

    public List<Zapato> findByCriteria(ZapatoCriteria zapatoCriteria){
        final Specification<Zapato> specification=createSpecification(zapatoCriteria);
        List<Zapato> zapatos=zapatoRepository.findAll(specification);
        return zapatos;
    }
    private Specification<Zapato> createSpecification(ZapatoCriteria criteria){
        Specification<Zapato> specification= Specification.where(null);
        if(criteria!=null){
            if(criteria.getVersion()!=null){
                specification=
                        specification.and(buildStringSpecification(criteria.getVersion(),Zapato_.version));
            }
            if(criteria.getColor()!=null){
                specification=specification.and(buildSpecification(criteria.getColor(),Zapato_.color));
            }
            if(criteria.getUnidadesExistentes()!=null){
                specification=
                        specification.and(buildRangeSpecification(criteria.getUnidadesExistentes(),Zapato_.unidadesExistentes));
            }
            if(criteria.getCambio()!=null){
                specification=
                        specification.and(buildSpecification(criteria.getCambio(),Zapato_.cambio));
            }
            if(criteria.getTalla()!=null){
                specification=
                        specification.and(buildReferringEntitySpecification(criteria.getTalla(), Zapato_.talla, Talla_.talla));
            }
            if(criteria.getTalla()!=null){
                specification=
                        specification.and(buildSpecification(criteria.getTalla(),
                                root -> root.join( Zapato_.talla, JoinType.LEFT).get(Talla_.talla)));
            }
            if(criteria.getMarca()!=null){
                specification=
                        specification.and(buildSpecification(criteria.getMarca(),
                                root -> root.join( Zapato_.talla, JoinType.LEFT)
                                        .join(Talla_.marca,JoinType.LEFT).get(Marca_.nombre)));
            }
        }
        return specification;
    }

}
