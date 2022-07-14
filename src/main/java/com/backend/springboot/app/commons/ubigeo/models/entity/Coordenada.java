package com.backend.springboot.app.commons.ubigeo.models.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "tlg_coordenada")
public class Coordenada {

    @Id
    @Column(name = "id_coordenada")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoordenada;

    @Column(name = "la_coordenada")
    private Integer latitud;

    @Column(name = "lo_coordenada")
    private Integer longitud;

    @OneToOne
    @JoinColumn(name = "id_direccion")
    // @JsonBackReference
    private Direccion direccion;
}
