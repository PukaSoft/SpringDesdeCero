package com.pukasoft.springDesdeCero.services;

import com.pukasoft.springDesdeCero.dao.RoleDao;
import com.pukasoft.springDesdeCero.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleDao roleDao;

    //Trae todos los usuarios
    public List<Role> getAll(){
        return roleDao.getAll();
    }

    //Trae un usuario
    public Role get(long id){
        return roleDao.get(id);
    }

    //Registro un usuario
    public Role registrer(Role role){
        //TODO : Regitrar en la base de datos
        return roleDao.registrer(role);
    }

    //Actualizar un usuario
    public Role update(Role role){
        //TODO : actualizar en la base de datos
        return roleDao.update(role);
    }

    //Eliminarr un usuario
    public void delete(long id){
        //TODO : actualizar en la base de datos
        roleDao.delete(id);
    }

}
