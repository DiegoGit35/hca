package com.andinos.hca.model.service;

import com.andinos.hca.model.dao.IItemProductoDAO;
import com.andinos.hca.model.dao.IProductoDAO;
import com.andinos.hca.model.entity.Carrito;
import com.andinos.hca.model.entity.ItemProducto;
import com.andinos.hca.model.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemProductoImpl implements IItemProductoService {
    @Autowired
    private IItemProductoDAO itemProductoDAO;
    @Autowired
    private IProductoDAO productoDao;


    @Override
    @Transactional(readOnly = true)
    public Page<ItemProducto> findAll(Pageable pageable) {
        return itemProductoDAO.findAll(pageable);
    }


    @Override
    @Transactional
    public ItemProducto save(ItemProducto itemProducto) {
        itemProductoDAO.save(itemProducto);
        return itemProducto;
    }

    @Override
    public boolean delete(Long id) {
        itemProductoDAO.deleteById(id);
        return true;
    }
    @Override
    public Integer aniadirItemProducto(Long idProducto, Integer cantidad, Carrito carrito) {
        int cantAniadida = cantidad;
        Producto producto = productoDao.findById( idProducto).get();
        ItemProducto itemProducto = itemProductoDAO.findByCarritoAndProducto(carrito, producto);
        if(itemProducto != null){
            cantAniadida += itemProducto.getCantidad();
            itemProducto.setCantidad(cantAniadida);
        } else {
            itemProducto = new ItemProducto();
            itemProducto.setCantidad(cantidad);
            itemProducto.setProducto(producto);
            itemProducto.setCarrito(carrito);
        }
        itemProductoDAO.save(itemProducto);
        return cantAniadida;
    }

//    public void sumarMismoItem(ItemProducto itemProducto){
////        implementar logica para sumar cantidades de productos iguales en el carrito
////        buena suerte!!
//    }
}