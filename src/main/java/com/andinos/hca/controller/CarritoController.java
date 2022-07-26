package com.andinos.hca.controller;

import com.andinos.hca.model.entity.Carrito;
import com.andinos.hca.model.service.CarritoServiceImpl;
import com.andinos.hca.model.service.IItemProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("{idUsuario}/carrito")
public class CarritoController {

    @Autowired
    private IItemProductoService itemProductoService;

    @Autowired
    private CarritoServiceImpl carritoServiceImpl;

    @GetMapping
    public  ResponseEntity<?> getItems(Long id){
        return new ResponseEntity<>(carritoServiceImpl.findOne(id).getItemProductos(), HttpStatus.FOUND);
    }

    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> crear(@RequestBody Carrito carrito){
        return new ResponseEntity<>(carritoServiceImpl.save(carrito), HttpStatus.CREATED);
    }


    @DeleteMapping(value = "/{idItem}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteItem(@PathVariable("idItem") Long id) {
        itemProductoService.delete(id);
    }


}
