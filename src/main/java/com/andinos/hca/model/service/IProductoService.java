package com.andinos.hca.model.service;

import com.andinos.hca.model.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();

    public void save(Producto producto);

    public Producto findOne(Long id);

    public void delete(Long id);
}
