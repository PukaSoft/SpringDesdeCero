package com.pukasoft.springDesdeCero.controllers;


import com.pukasoft.springDesdeCero.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    //@GetMapping("/hola")
    //Trae todos los usuarios
    @RequestMapping(value = "/",method = RequestMethod.GET)
    List<User> getAll(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setNombre("Johan");
        user.setApellido("Emanuel");

        list.add(user);

        return list;
    }


    //Trae un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    User get(@PathVariable long id){

        User user = new User();
        user.setNombre("Johan");
        user.setApellido("Emanuel");


        return user;
    }

    //Registro un usuario
    @RequestMapping(value = "/",method = RequestMethod.POST)
    User registrer(@RequestBody User user){
        //TODO : Regitrar en la base de datos
        return user;
    }

    //Actualizar un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    User update(@RequestBody User user){
        //TODO : actualizar en la base de datos
        return user;
    }

    //Eliminarr un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
   void delete(@PathVariable long id){
        //TODO : actualizar en la base de datos
    }



}
