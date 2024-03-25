package com.example.mscatalogo.service;

import com.example.mscatalogo.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    List<Categoria> lista();
    Categoria guardar(Categoria categoria);
    Optional<Categoria> listarPorId(Integer id);
    Categoria actualizar(Categoria categoria);
    void eliminar(Integer id);
}
