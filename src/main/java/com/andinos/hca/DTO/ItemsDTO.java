package com.andinos.hca.DTO;

import com.andinos.hca.model.entity.Carrito;

public class ItemsDTO {

    public Integer cantidad;
    public Carrito carrito;

    public ItemsDTO(Integer cantidad, Carrito carrito) {
        this.cantidad = cantidad;
        this.carrito = carrito;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Carrito getCarrito() {
        return carrito;
    }
}
