package com.andinos.hca.model.service;

import com.andinos.hca.model.entity.Carrito;
import com.andinos.hca.model.entity.ItemProducto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IItemProductoService {

    public Page<ItemProducto> findAll(Pageable pageable);

    public ItemProducto save(ItemProducto ItemProducto);

    public boolean delete(Long id);

    Integer aniadirItemProducto(Long idProducto, Integer cantidad, Carrito carrito);

//    void sumarMismoItem(ItemProducto itemProducto);
}
