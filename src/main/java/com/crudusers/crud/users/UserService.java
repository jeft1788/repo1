package com.crudusers.crud.users;

import java.util.List;

public interface UserService {
    List<Usuario>listar();
    Usuario listarid(int id);
    Usuario nuevo(Usuario u);
    Usuario editar(Usuario u);
    Usuario eliminar(int id);


}
