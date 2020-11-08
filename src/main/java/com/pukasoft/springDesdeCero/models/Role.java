package com.pukasoft.springDesdeCero.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role extends BaseEntity {

    @Column(name = "nombre")
    private String nombre;


    //Permisos

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,mappedBy = "role")
    private Set<Permiso> permisos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
