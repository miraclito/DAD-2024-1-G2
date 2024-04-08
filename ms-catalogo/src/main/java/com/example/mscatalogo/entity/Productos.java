package com.example.mscatalogo.entity;

import com.example.mscatalogo.repository.CategoriaRepository;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Data
@Entity

public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Number cantidad;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "productos", cascade = CascadeType.ALL)
    private List<Categoria> categorias;
}
