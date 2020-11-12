package com.pukasoft.springDesdeCero.dao.imp;

import com.pukasoft.springDesdeCero.dao.PermisoDao;
import com.pukasoft.springDesdeCero.models.Permiso;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Transactional
@Repository
public class PermisoDaoImp implements PermisoDao {

    @PersistenceContext
    EntityManager entityManager;


    @Transactional
    @Override
    public List<Permiso> getAll() {
        String hsl = "FROM Permiso as p";
        return (List<Permiso>) entityManager.createQuery(hsl).getResultList();
    }

    @Transactional
    @Override
    public Permiso get(long id) {

        return entityManager.find(Permiso.class, id);
    }

    @Transactional
    @Override
    public Permiso registrer(Permiso permiso) {
        entityManager.merge(permiso);
        return permiso;
    }

    @Transactional
    @Override
    public Permiso update(Permiso permiso) {
        entityManager.merge(permiso);
        return permiso;
    }

    @Transactional
    @Override
    public void delete(long id) {
        Permiso permiso = get(id);
        entityManager.remove(permiso);

    }
}
