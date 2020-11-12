package com.pukasoft.springDesdeCero.dao;

import com.pukasoft.springDesdeCero.models.Role;
import java.util.List;

public interface RoleDao {

    //Trae todos los usuarios
    List<Role> getAll();

    //Trae un usuario
    Role get(long id);

    //Registro un usuario
    Role registrer(Role role);

    //Actualizar un usuario
    Role update(Role role);

    //Eliminarr un usuario
    void delete(long id);


}
