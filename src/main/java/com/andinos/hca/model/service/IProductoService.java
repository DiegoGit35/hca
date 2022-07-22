package com.andinos.hca.model.service;

import com.andinos.hca.model.entity.Categoria;
import com.andinos.hca.model.entity.Producto;

import java.util.List;
import java.util.Set;

public interface IProductoService {
    public List<Producto> findAll();

    public void save(Producto producto);

    public Producto findOne(Long id);

    public void delete(Long id);

    public Set<Producto> buscarPorNombre(String parteNombre);

    public Set<Producto> filtrarPorCategoria(Categoria categoria);

}
