package com.andinos.hca.model.service;

import com.andinos.hca.model.dao.IProductoDAO;
import com.andinos.hca.model.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private IProductoDAO productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public Producto findOne(Long id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        productoDao.deleteById(id);
    }
}
