package com.andinos.hca.controller;


import com.andinos.hca.model.entity.Categoria;
import com.andinos.hca.model.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping(name = "productos/")
    public ResponseEntity<?> getProductos(){
        return new ResponseEntity<> (productoService.findAll(),
                HttpStatus.ACCEPTED);
    }
    @GetMapping(name = "buscar/{busqueda}")
    public ResponseEntity<?> getProductoPorNombre(@PathVariable(value = "busqueda") String busqueda){
        return new ResponseEntity<>(productoService.buscarPorNombre(busqueda), HttpStatus.FOUND);
    }

    @GetMapping(name = "{categoria}/")
    public ResponseEntity<?> getProductoPorCategoria(@PathVariable(value = "categoria") Categoria categoria){
        return new ResponseEntity<>(productoService.filtrarPorCategoria(categoria), HttpStatus.OK);
    }

}
