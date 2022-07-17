package com.andinos.hca.model.dao;

import com.andinos.hca.model.entity.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarritoDAO extends JpaRepository<Carrito, Long> {
}
