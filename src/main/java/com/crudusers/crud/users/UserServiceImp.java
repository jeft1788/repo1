package com.crudusers.crud.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository repositorio;
    @Override
    public List<Usuario> listar() {
        return this.repositorio.findAll();
    }

    @Override
    public Usuario listarid(int id) {
        return (Usuario) repositorio.findAll();
    }

    @Override
    public Usuario nuevo(Usuario u) {
        return null;
    }

    @Override
    public Usuario editar(Usuario u) {
        return null;
    }

    @Override
    public Usuario eliminar(int id) {
        return null;
    }
}
