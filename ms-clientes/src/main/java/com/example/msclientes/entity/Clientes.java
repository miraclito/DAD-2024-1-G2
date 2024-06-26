package com.example.msclientes.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.print.attribute.standard.NumberOfDocuments;
import java.util.Date;

@Data
@Entity
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String DNI;
    private Date Fechadenacimiento;

}
