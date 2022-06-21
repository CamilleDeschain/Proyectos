package com.tw.Crud.service;


import com.tw.Crud.entity.Producto;
import com.tw.Crud.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public Page<Producto> paginas(Pageable pageable){
        return productoRepository.findAll(pageable);
    }
}
