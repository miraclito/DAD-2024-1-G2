package com.example.mspedido.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
public class ClienteDto {

    private Integer id;
    private String nombre;
    private String DNI;
    private Date Fechadenacimiento;
}
