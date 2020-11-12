package com.pukasoft.springDesdeCero.controllers;
import com.pukasoft.springDesdeCero.models.Permiso;
import com.pukasoft.springDesdeCero.services.PermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permiso")
public class PermisoController {

    @Autowired
    PermisoService permisoService;

    //@GetMapping("/hola")
    //Trae todos los usuarios
    @RequestMapping(value = "/",method = RequestMethod.GET)
    List<Permiso> getAll(){
        return permisoService.getAll();
    }


    //Trae un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    Permiso get(@PathVariable long id){
        return permisoService.get(id);
    }

    //Registro un usuario
    @RequestMapping(value = "/",method = RequestMethod.POST)
    Permiso registrer(@RequestBody Permiso permiso){
        //TODO : Regitrar en la base de datos
        return permisoService.registrer(permiso);
    }

    //Actualizar un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    Permiso update(@RequestBody Permiso permiso){
        //TODO : actualizar en la base de datos
        return permisoService.update(permiso);
    }

    //Eliminarr un usuario
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        //TODO : actualizar en la base de datos
        permisoService.delete(id);
    }


}
