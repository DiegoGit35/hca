package com.andinos.hca.model.service;


import com.andinos.hca.model.dao.ICarritoDAO;
import com.andinos.hca.model.dao.IProductoDAO;
import com.andinos.hca.model.entity.Carrito;
import com.andinos.hca.model.entity.ItemProducto;
import com.andinos.hca.model.entity.Producto;
import com.andinos.hca.model.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Stream;

@Service
public class CarritoServiceImpl implements ICarritoService {

    @Autowired
    private ICarritoDAO carritoDao;


    @Override
    public List<Carrito> findAll() {
        return (List<Carrito>) carritoDao.findAll();
    }

    @Override
    @Transactional
    public Carrito save(Carrito carrito) {
        carritoDao.save(carrito);
        return carrito;
    }

    @Override
    public Carrito findOne(Long id) {
        return carritoDao.findByUsuarioId(id).orElse(null);
    }

    @Override
    public boolean delete(Long id) {
        carritoDao.deleteById(id);
        return true;
    }


}
