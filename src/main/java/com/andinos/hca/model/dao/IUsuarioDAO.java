package com.andinos.hca.model.dao;

import com.andinos.hca.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {
}
