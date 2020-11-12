package com.pukasoft.springDesdeCero.controllers;

import com.pukasoft.springDesdeCero.models.Role;
import com.pukasoft.springDesdeCero.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    //@GetMapping("/hola")
    //Trae todos los usuarios
    @RequestMapping(value = "/",method = RequestMethod.GET)
    List<Role> getAll(){
        return roleService.getAll();
    }


    //Trae un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    Role get(@PathVariable long id){
        return roleService.get(id);
    }

    //Registro un usuario
    @RequestMapping(value = "/",method = RequestMethod.POST)
    Role registrer(@RequestBody Role role){
        //TODO : Regitrar en la base de datos
        return roleService.registrer(role);
    }

    //Actualizar un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    Role update(@RequestBody Role role){
        //TODO : actualizar en la base de datos
        return roleService.update(role);
    }

    //Eliminarr un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        //TODO : actualizar en la base de datos
        roleService.delete(id);
    }



}
