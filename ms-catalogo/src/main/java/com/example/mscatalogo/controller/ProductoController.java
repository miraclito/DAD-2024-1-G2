package com.example.mscatalogo.controller;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.entity.Productos;
import com.example.mscatalogo.service.CategoriaService;
import com.example.mscatalogo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping
    ResponseEntity<List<Productos>> listar() {
        return ResponseEntity.ok(productoService.lista());
    }
    @PostMapping()
    public ResponseEntity<Productos> guardar(@RequestBody Productos producto) {
        return ResponseEntity.ok(productoService.guardar(producto));
    }

    @GetMapping("/{id}")
    ResponseEntity<Productos> listarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok(productoService.listarPorId(id).get());
    }
    @PutMapping
    ResponseEntity<Productos> actualizar(@RequestBody Productos producto){
        return ResponseEntity.ok(productoService.actualizar(producto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Productos>> eliminar(@PathVariable(required = true) Integer id){
        productoService.eliminar(id);
        return ResponseEntity.ok(productoService.lista());
    }


}
