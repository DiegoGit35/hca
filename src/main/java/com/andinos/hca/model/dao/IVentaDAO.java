package com.andinos.hca.model.dao;

import com.andinos.hca.model.entity.Venta;
import org.springframework.data.repository.CrudRepository;

public interface IVentaDAO extends CrudRepository<Venta, Long> {
}
