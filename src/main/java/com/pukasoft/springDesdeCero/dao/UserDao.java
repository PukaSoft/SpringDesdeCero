package com.pukasoft.springDesdeCero.dao;

import com.pukasoft.springDesdeCero.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

public interface UserDao {

    //Trae todos los usuarios
    List<User> getAll();

    //Trae un usuario
    User get(long id);

    //Registro un usuario
    User registrer(User user);

    //Actualizar un usuario
    User update(User user);

    //Eliminarr un usuario
    void delete(long id);

    public User login(User user);


}
