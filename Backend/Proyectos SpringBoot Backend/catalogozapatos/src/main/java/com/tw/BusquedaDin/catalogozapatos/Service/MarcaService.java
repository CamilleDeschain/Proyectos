package com.tw.BusquedaDin.catalogozapatos.Service;

import com.tw.BusquedaDin.catalogozapatos.Model.Marca;
import com.tw.BusquedaDin.catalogozapatos.Model.Zapato;
import com.tw.BusquedaDin.catalogozapatos.Repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


    @Service
    @Transactional(readOnly = true)
    public class MarcaService {
        @Autowired
        private MarcaRepository marcaRepository;

        public List<Marca> findAll(){
            return marcaRepository.findAll();
        }
    }

