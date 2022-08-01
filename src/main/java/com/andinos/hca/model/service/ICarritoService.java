package com.andinos.hca.model.service;

import com.andinos.hca.model.entity.Carrito;
import com.andinos.hca.model.entity.ItemProducto;
import com.andinos.hca.model.entity.Usuario;

import java.util.List;

public interface ICarritoService {
    public List<Carrito> findAll();

    public Carrito save(Carrito carrito);

    public Carrito findOne(Long id);

    public boolean delete(Long id);


//    public void update(Carrito carrito);
}
