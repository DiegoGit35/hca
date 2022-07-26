package com.andinos.hca.model.service;

import com.andinos.hca.model.entity.ItemProducto;
import com.andinos.hca.model.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IItemProductoService {

    public Page<ItemProducto> findAll(Pageable pageable);

    public boolean save(ItemProducto ItemProducto);

    public boolean delete(Long id);


//    void sumarMismoItem(ItemProducto itemProducto);
}
