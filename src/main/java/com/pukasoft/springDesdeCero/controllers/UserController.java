package com.pukasoft.springDesdeCero.controllers;


import com.pukasoft.springDesdeCero.models.User;
import com.pukasoft.springDesdeCero.services.UserService;
import com.pukasoft.springDesdeCero.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private JWTUtil jwtUtil;

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
    void registrer(@RequestBody User user){
        //TODO : Regitrar en la base de datos
        userService.registrer(user);
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


    @RequestMapping(value = "/login", method =RequestMethod.POST)
    Map<String,Object> login(@RequestBody User dto){
        User user = userService.login(dto);

    Map<String,Object> result = new HashMap<>();
    if (user !=null){
        String token = jwtUtil.create(String.valueOf(user.getId()),user.getEmail());
        result.put("token",token);
        result.put("user",user);
    }
    return result;
    }


}
