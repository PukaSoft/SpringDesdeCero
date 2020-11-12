package com.pukasoft.springDesdeCero.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "permisos")
@NoArgsConstructor
@AllArgsConstructor
public class Permiso extends  BaseEntity{
    @Column(name = "nombre")
    @Getter @Setter
    private String nombre;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("role_id") //
    @ManyToOne(fetch = FetchType.LAZY) //Solo me trae el ID
    @JoinColumn(name = "role_id")
    @Getter @Setter
    private Role role;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permiso permiso = (Permiso) o;
        return Objects.equals(nombre, permiso.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Permiso{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
