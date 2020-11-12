package com.pukasoft.springDesdeCero.services;

import com.pukasoft.springDesdeCero.dao.PermisoDao;
import com.pukasoft.springDesdeCero.models.Permiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoService {

    @Autowired
    PermisoDao permisoDao;

    //Trae todos los usuarios
    public List<Permiso> getAll(){
        return permisoDao.getAll();
    }

    //Trae un usuario
    public Permiso get(long id){
        return permisoDao.get(id);
    }

    //Registro un usuario
    public Permiso registrer(Permiso permiso){
        //TODO : Regitrar en la base de datos
        return permisoDao.registrer(permiso);
    }

    //Actualizar un usuario
    public Permiso update(Permiso permiso){
        //TODO : actualizar en la base de datos
        return permisoDao.update(permiso);
    }

    //Eliminarr un usuario
    public void delete(long id){
        //TODO : actualizar en la base de datos
        permisoDao.delete(id);
    }

}
