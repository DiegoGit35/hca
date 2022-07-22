package com.andinos.hca.model.service;

import com.andinos.hca.model.entity.ItemProducto;
import com.andinos.hca.model.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IItemProductoService {

    public Iterable<ItemProducto> findAll();

    public Page<ItemProducto> findAll(Pageable pageable);

    public void save(ItemProducto ItemProducto);


}
