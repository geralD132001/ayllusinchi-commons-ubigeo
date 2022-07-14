package com.backend.springboot.app.commons.ubigeo.models.entity;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "tcd_provincia")
public class Provincia {

    @Id
    @Column(name = "id_provincia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProvincia;

    @Column(name = "no_provincia")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    // @JsonBackReference
    private Departamento departamento;
}
