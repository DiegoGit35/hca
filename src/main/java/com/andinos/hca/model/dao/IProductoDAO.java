package com.andinos.hca.model.dao;

import com.andinos.hca.model.entity.Categoria;
import com.andinos.hca.model.entity.Producto;
import com.andinos.hca.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface IProductoDAO extends JpaRepository<Producto, Long> {
    Set<Producto> buscarPorNombre(String parteNombre);

    Set<Producto> filtrarPorCategoria(Categoria categoria);

    void aniadirItem(Long idProducto, Long idUsuario);
}
