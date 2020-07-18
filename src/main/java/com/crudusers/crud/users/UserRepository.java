package com.crudusers.crud.users;

import org.springframework.data.repository.Repository;

import java.util.List;



public interface UserRepository extends Repository<Usuario, Integer> {
    List<Usuario>findAll();
    //Usuario findone(int id);
    Usuario save(Usuario u);
    void delete(Usuario u);
}
