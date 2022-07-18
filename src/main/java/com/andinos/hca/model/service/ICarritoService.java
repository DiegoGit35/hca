package com.andinos.hca.model.service;

import com.andinos.hca.model.entity.Carrito;

import java.util.List;

public interface ICarritoService {
    public List<Carrito> findAll();

    public void save(Carrito carrito);

    public Carrito findOne(Long id);

    public void delete(Long id);
}
