package com.tw.BusquedaDinamica.controller;

import com.tw.BusquedaDinamica.criteria.ComputadoraCriteria;
import com.tw.BusquedaDinamica.dto.BusquedaDTO;
import com.tw.BusquedaDinamica.enums.Color;
import com.tw.BusquedaDinamica.model.Computadora;
import com.tw.BusquedaDinamica.service.ComputadoraService;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.StringFilter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/computadora")
@CrossOrigin(origins = "http://localhost:4200")
public class ComputadoraController {

    @Autowired
    ComputadoraService computadoraService;

    @PostMapping("/list")
    public ResponseEntity<List<Computadora>> list(@RequestBody BusquedaDTO busquedaDTO){
        ComputadoraCriteria computadoraCriteria = createCriteria(busquedaDTO);
        List<Computadora> list = computadoraService.findByCriteria(computadoraCriteria);
        return new ResponseEntity<List<Computadora>>(list, HttpStatus.OK);
    }

    private ComputadoraCriteria createCriteria(BusquedaDTO dto){
        ComputadoraCriteria computadoraCriteria = new ComputadoraCriteria();
        if(dto!=null){
            if(!StringUtils.isBlank(dto.getMarca())){
                StringFilter filter = new StringFilter();
                filter.setEquals(dto.getMarca());
                computadoraCriteria.setMarca(filter);
            }
            if(!StringUtils.isBlank(dto.getModelo())){
                StringFilter filter = new StringFilter();
                filter.setEquals(dto.getModelo());
                computadoraCriteria.setModelo(filter);
            }
            if(!StringUtils.isBlank(dto.getVersion())){
                StringFilter filter = new StringFilter();
                filter.setContains(dto.getVersion());
                computadoraCriteria.setVersion(filter);
            }
            if(!StringUtils.isBlank(dto.getCambio())){
                BooleanFilter filter = new BooleanFilter();
                switch (dto.getCambio()){
                    case "true":
                        filter.setEquals(true);
                        break;
                    case "false":
                        filter.setEquals(false);
                        break;
                        default:
                            filter.setEquals(false);
                            break;
                }
                computadoraCriteria.setCambio(filter);
            }
            if(!StringUtils.isBlank(dto.getColor())){
                ComputadoraCriteria.ColorFilter filter = new ComputadoraCriteria.ColorFilter();
                String color = dto.getColor().toUpperCase();
                filter.setEquals(Color.valueOf(color));
                computadoraCriteria.setColor(filter);
            }
            if(dto.getTamanoDesde()!=null || dto.getTamanoHasta()!=null){
                IntegerFilter filter = new IntegerFilter();
                if(dto.getTamanoDesde()!=null){
                    filter.setGreaterThanOrEqual(dto.getTamanoDesde());
                    computadoraCriteria.setTamanoDisco(filter);
                }
                if(dto.getTamanoHasta()!=null){
                    filter.setLessThanOrEqual(dto.getTamanoHasta());
                    computadoraCriteria.setTamanoDisco(filter);
                }
            }
        }
        return computadoraCriteria;
    }
}
