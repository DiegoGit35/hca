package com.andinos.hca.model.dao;

import com.andinos.hca.model.entity.Carrito;
import com.andinos.hca.model.entity.ItemProducto;
import com.andinos.hca.model.entity.Producto;
import com.andinos.hca.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IItemProductoDAO extends JpaRepository<ItemProducto, Long> {
}
