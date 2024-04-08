package com.example.mscatalogo.repository;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{
}
