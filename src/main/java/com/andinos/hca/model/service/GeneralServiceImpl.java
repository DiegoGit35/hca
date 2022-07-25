package com.andinos.hca.model.service;

import com.andinos.hca.model.dao.ICarritoDAO;
import com.andinos.hca.model.dao.IItemProductoDAO;
import com.andinos.hca.model.dao.IProductoDAO;
import com.andinos.hca.model.dao.IUsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class GeneralServiceImpl implements IGeneralService{

    @Autowired
    IProductoDAO productoDAO;

    @Autowired
    IItemProductoDAO itemProductoDAO;

    @Autowired
    ICarritoDAO carritoDAO;

    @Autowired
    IUsuarioDAO usuarioDAO;

    public boolean aniadirProducto(Long idProducto, Long idUsuario) {

        return true;
    }
}
