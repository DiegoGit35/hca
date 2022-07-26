package com.andinos.hca.model.service;

import com.andinos.hca.model.entity.Carrito;
import com.andinos.hca.model.entity.ItemProducto;

import java.util.List;

public interface ICarritoService {
    public List<Carrito> findAll();

    public boolean save(Carrito carrito);

    public Carrito findOne(Long id);

    public boolean delete(Long id);

    boolean aniadirItemProducto(ItemProducto itemProducto);

//    public void update(Carrito carrito);
}
