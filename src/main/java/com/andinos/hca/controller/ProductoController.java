package com.andinos.hca.controller;


import com.andinos.hca.model.entity.*;
import com.andinos.hca.model.exceptions.ProductoNotFoundException;
import com.andinos.hca.model.service.IGeneralService;
import com.andinos.hca.model.service.IItemProductoService;
import com.andinos.hca.model.service.IProductoService;
import com.andinos.hca.model.service.ICarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @Autowired
    private ICarritoService carritoService;

    @Autowired
    private IItemProductoService itemProductoService;

    @GetMapping
    public ResponseEntity<?> getProductos() {
        return new ResponseEntity<>(productoService.findAll(),
                HttpStatus.FOUND);
    }

//    @GetMapping(name = "busqueda/{busqueda}")
//    public ResponseEntity<?> getProductoPorNombre(@PathVariable(value = "busqueda") String busqueda) {
//        return new ResponseEntity<>(productoService.buscarPorNombre(busqueda), HttpStatus.FOUND);
//    }

//    @GetMapping(name = "{categoria}/")
//    public ResponseEntity<?> getProductoPorCategoria(@PathVariable(value = "categoria") Categoria categoria) {
//        return new ResponseEntity<>(productoService.filtrarPorCategoria(categoria), HttpStatus.OK);
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Producto producto) {
//        Preconditions.checkNotNull(producto);
        productoService.save(producto);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@PathVariable("id") Long id, @RequestBody Producto producto) {
//        Preconditions.checkNotNull(producto);
//        RestPreconditions.checkNotNull(productoService.getById(producto.getIdproducto()));
        productoService.save(producto);
    }


    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        productoService.delete(id);
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity<?> aniadirProductoAlCarrito(@PathVariable Long idProducto, @RequestBody Long idCarrito, @RequestBody Integer cantidad) {

        Producto producto;
        try {
            producto = productoService.findById(idProducto);
        } catch (ProductoNotFoundException e) {
            throw new RuntimeException(e);
        }

        Carrito carrito = carritoService.findOne(idCarrito);

        ItemProducto itemProducto = new ItemProducto();
        itemProducto.setProducto(producto);
        itemProducto.setCarrito(carrito);
        itemProducto.setCantidad(cantidad);
        itemProductoService.save(itemProducto);

        return new ResponseEntity<>(carritoService.aniadirItemProducto(itemProducto), HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> quitarProductoAlCarrito(@PathVariable Long idProducto, @RequestBody Long idCarrito, @RequestBody Integer cantidad) {

        Producto producto;
        try {
            producto = productoService.findById(idProducto);
        } catch (ProductoNotFoundException e) {
            throw new RuntimeException(e);
        }

        Carrito carrito = carritoService.findOne(idCarrito);

        ItemProducto itemProducto = new ItemProducto();
        itemProducto.setProducto(producto);
        itemProducto.setCarrito(carrito);
        itemProducto.setCantidad(cantidad);

        return new ResponseEntity<>(carritoService.aniadirItemProducto(itemProducto), HttpStatus.ACCEPTED);
    }
}
