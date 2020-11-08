package com.pukasoft.springDesdeCero.controllers;


import com.pukasoft.springDesdeCero.models.User;
import com.pukasoft.springDesdeCero.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    //@GetMapping("/hola")
    //Trae todos los usuarios
    @RequestMapping(value = "/",method = RequestMethod.GET)
    List<User> getAll(){
        return userService.getAll();
    }


    //Trae un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    User get(@PathVariable long id){
        return userService.get(id);
    }

    //Registro un usuario
    @RequestMapping(value = "/",method = RequestMethod.POST)
    User registrer(@RequestBody User user){
        //TODO : Regitrar en la base de datos
        return userService.registrer(user);
    }

    //Actualizar un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    User update(@RequestBody User user){
        //TODO : actualizar en la base de datos
        return userService.update(user);
    }

    //Eliminarr un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
   void delete(@PathVariable long id){
        //TODO : actualizar en la base de datos
        userService.delete(id);
    }



}
