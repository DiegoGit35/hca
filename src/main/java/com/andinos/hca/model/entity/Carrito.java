package com.andinos.hca.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "carrito")
public class Carrito implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
