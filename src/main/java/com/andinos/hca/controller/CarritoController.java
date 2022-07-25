package com.andinos.hca.controller;

import com.andinos.hca.model.entity.Carrito;
import com.andinos.hca.model.service.CarritoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("{idUsuario}/carrito")
public class CarritoController {

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


    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        carritoServiceImpl.delete(id);
    }


}
