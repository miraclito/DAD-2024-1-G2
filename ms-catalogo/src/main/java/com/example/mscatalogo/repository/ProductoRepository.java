package com.example.mscatalogo.repository;

import com.example.mscatalogo.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Productos, Integer> {
}
