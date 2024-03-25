package com.example.mscatalogo.controller;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.service.CategoriaService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping
    ResponseEntity<List<Categoria>> listar() {
        return ResponseEntity.ok(categoriaService.lista());
    }
    @PostMapping
    ResponseEntity<Categoria> guardar(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(categoriaService.guardar(categoria));
    }
    @GetMapping("/{id}")
    ResponseEntity<Categoria> listarPorId(@PathVariable(required = true) Integer id){
        return  ResponseEntity.ok(categoriaService.listarPorId(id).get());

    }
    @PutMapping
    ResponseEntity<Categoria> actualizar(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.actualizar(categoria));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Categoria>> eliminar(@PathVariable(required = true) Integer id){
        categoriaService.eliminar(id);
        return ResponseEntity.ok(categoriaService.lista());
    }


}
