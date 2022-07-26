package com.andinos.hca.model.service;

import com.andinos.hca.model.dao.IUsuarioDAO;
import com.andinos.hca.model.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioDAO IUsuarioDAO;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Usuario> findAll() {
        return IUsuarioDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Usuario> findAll(Pageable pageable) {
        return IUsuarioDAO.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> findById(Long id) {
        return IUsuarioDAO.findById(id);
    }

    @Override
    @Transactional
    public Usuario save(Usuario Usuario) {
        return IUsuarioDAO.save(Usuario);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        IUsuarioDAO.deleteById(id);
    }
}
