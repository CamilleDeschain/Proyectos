package com.tw.BusquedaDinamica.service;


import com.tw.BusquedaDinamica.model.Marca;
import com.tw.BusquedaDinamica.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class MarcaService {

    @Autowired
    MarcaRepository marcaRepository;

    public List<Marca> findAll(){
        return marcaRepository.findAll();
    }
}
