package com.backend.springboot.app.commons.ubigeo.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tcd_direccion")
public class Direccion {

    @Id
    @Column(name = "id_direccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccion;

    @Column(name = "no_direccion")
    private String nombre;

    @Column(name = "nu_direccion")
    private int numero;

    @ManyToOne
    @JoinColumn(name = "id_comunidad")
    // @JsonBackReference
    private Comunidad comunidad;
}
