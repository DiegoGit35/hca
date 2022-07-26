package com.andinos.hca.model.service;


import com.andinos.hca.model.dao.ICarritoDAO;
import com.andinos.hca.model.entity.Carrito;
import com.andinos.hca.model.entity.ItemProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoServiceImpl implements ICarritoService{

    @Autowired
    private ICarritoDAO carritoDao;

    @Override
    public List<Carrito> findAll() {
        return (List<Carrito>) carritoDao.findAll();
    }

    @Override
    public boolean save(Carrito carrito) {
        carritoDao.save(carrito);
        return true;
    }

    @Override
    public Carrito findOne(Long id) {
        return carritoDao.findById(id).orElse(null);
    }

    @Override
    public boolean delete(Long id) {
        carritoDao.deleteById(id);
        return true;
    }

    @Override
    public boolean aniadirItemProducto(ItemProducto itemProducto) {
        Carrito carrito = new Carrito();
        carrito.addItemProducto(itemProducto);
        carritoDao.save(carrito);
        return true;
    }
}
