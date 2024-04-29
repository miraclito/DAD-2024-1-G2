package com.example.mscatalogo.service;

import com.example.mscatalogo.entity.Productos;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Productos> lista();
    Productos guardar(Productos productos);
    Optional<Productos> listarPorId(Integer id);
    Productos actualizar(Productos productos);
    void eliminar(Integer id);
}
