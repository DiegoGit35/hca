package com.andinos.hca.controller;


import com.andinos.hca.model.service.IItemProductoService;
import com.andinos.hca.model.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ItemProductoController {

    @Autowired
    private IItemProductoService itemProductoService;

    public ResponseEntity<?> guardarItem(Enti){
        return new ResponseEntity<> (itemProductoService.save(),
                HttpStatus.ACCEPTED);
    }
}
