package com.andinos.hca.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "item_producto")
public class ItemProducto implements Serializable {
    public ItemProducto() {
    }

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iditem_producto", nullable = false)
    private Long id;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name="idcarrito", nullable=false)
    private Carrito carrito;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idproducto")
    private Producto producto;

    public ItemProducto(Long id, Integer cantidad, Carrito carrito, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.carrito = carrito;
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
