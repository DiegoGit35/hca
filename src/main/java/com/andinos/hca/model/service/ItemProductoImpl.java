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
public class ItemProductoImpl implements IItemProductoService{
    @Autowired
    private com.andinos.hca.model.dao.IItemProductoDAO IItemProductoDAO;

    @Override
    @Transactional(readOnly = true)
    public Iterable<ItemProducto> findAll() {
        return IItemProductoDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ItemProducto> findAll(Pageable pageable) {
        return IItemProductoDAO.findAll(pageable);
    }


    @Transactional(readOnly = true)
    public Optional<ItemProducto> findById(Long id) {
        return IItemProductoDAO.findById(id);
    }

    @Override
    @Transactional
    public ItemProducto save(ItemProducto ItemProducto) {
        return IItemProductoDAO.save(ItemProducto);
    }


    @Transactional
    public void deleteById(Long id) {
        IItemProductoDAO.deleteById(id);
    }
}
