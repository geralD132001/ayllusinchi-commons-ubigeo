package com.backend.springboot.app.commons.ubigeo.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tcd_comunidad")
public class Comunidad {

    @Id
    @Column(name = "id_comunidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComunidad;

    @Column(name = "no_comunidad")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_distrito")
    // @JsonBackReference
    private Distrito distrito;

}
