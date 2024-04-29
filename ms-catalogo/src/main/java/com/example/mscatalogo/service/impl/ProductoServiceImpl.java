package com.example.mscatalogo.service.impl;

import com.example.mscatalogo.entity.Productos;
import com.example.mscatalogo.repository.ProductoRepository;
import com.example.mscatalogo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public List<Productos> lista() {
        return productoRepository.findAll();
    }

    @Override
    public Productos guardar(Productos productos) {
        return productoRepository.save(productos);
    }

    @Override
    public Optional<Productos> listarPorId(Integer id) {
        return productoRepository.findById(id);
    }


    @Override
    public Productos actualizar(Productos productos) {
        return productoRepository.save(productos);
    }

    @Override
    public void eliminar(Integer id) {
        productoRepository.deleteById(id);

    }
}
