package com.backend.springboot.app.commons.ubigeo.models.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "tma_departamento")
public class Departamento {

    @Id
    @Column(name = "id_departamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepartamento;

    @Column(name = "no_departamento")
    private String nombre;
}
