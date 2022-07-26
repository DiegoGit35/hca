package com.andinos.hca.model.service;

import com.andinos.hca.model.dao.IItemProductoDAO;
import com.andinos.hca.model.entity.ItemProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ItemProductoImpl implements IItemProductoService {
    @Autowired
    private IItemProductoDAO IItemProductoDAO;


    @Override
    @Transactional(readOnly = true)
    public Page<ItemProducto> findAll(Pageable pageable) {
        return IItemProductoDAO.findAll(pageable);
    }


    @Override
    @Transactional
    public boolean save(ItemProducto ItemProducto) {
        IItemProductoDAO.save(ItemProducto);
        return true;
    }

    @Override
    public boolean delete(Long id) {
        IItemProductoDAO.deleteById(id);
        return true;
    }


//    public void sumarMismoItem(ItemProducto itemProducto){
////        implementar logica para sumar cantidades de productos iguales en el carrito
////        buena suerte!!
//    }
}