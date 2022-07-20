package com.andinos.hca.controller;

import com.andinos.hca.model.entity.ItemProducto;
import com.andinos.hca.model.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping("/carrito")
    public Set<ItemProducto> getItems(Long id){
        return carritoService.findOne(id).getItemProductos();
    }

}
