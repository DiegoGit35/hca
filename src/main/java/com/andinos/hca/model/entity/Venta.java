package com.andinos.hca.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
