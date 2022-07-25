package com.andinos.hca.controller;


import com.andinos.hca.model.entity.Categoria;
import com.andinos.hca.model.entity.Producto;
import com.andinos.hca.model.service.IGeneralService;
import com.andinos.hca.model.service.IProductoService;
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
    private IGeneralService generalService;

    @GetMapping
    public ResponseEntity<?> getProductos() {
        return new ResponseEntity<>(productoService.findAll(),
                HttpStatus.FOUND);
    }

    @GetMapping(name = "busqueda/{busqueda}")
    public ResponseEntity<?> getProductoPorNombre(@PathVariable(value = "busqueda") String busqueda) {
        return new ResponseEntity<>(productoService.buscarPorNombre(busqueda), HttpStatus.FOUND);
    }

    @GetMapping(name = "{categoria}/")
    public ResponseEntity<?> getProductoPorCategoria(@PathVariable(value = "categoria") Categoria categoria) {
        return new ResponseEntity<>(productoService.filtrarPorCategoria(categoria), HttpStatus.OK);
    }

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
    public ResponseEntity<?> aniadirProductoAlCarrito(@PathVariable Long idProducto, @RequestBody Long idUsuario){
        return new ResponseEntity<>(generalService.aniadirProducto(idProducto, idUsuario), HttpStatus.ACCEPTED);
    }
}
