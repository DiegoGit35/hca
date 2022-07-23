package com.andinos.hca.model.dao;

import com.andinos.hca.model.entity.ItemProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemProductoDAO extends JpaRepository<ItemProducto, Long> {

    void sumarCantidad(ItemProducto itemProducto);
}
