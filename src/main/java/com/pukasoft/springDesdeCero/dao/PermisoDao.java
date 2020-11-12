package com.pukasoft.springDesdeCero.dao;

import com.pukasoft.springDesdeCero.models.Permiso;
import java.util.List;

public interface PermisoDao {

    //Trae todos los usuarios
    List<Permiso> getAll();

    //Trae un usuario
    Permiso get(long id);

    //Registro un usuario
    Permiso registrer(Permiso permiso);

    //Actualizar un usuario
    Permiso update(Permiso permiso);

    //Eliminarr un usuario
    void delete(long id);


}
