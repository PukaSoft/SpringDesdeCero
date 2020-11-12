package com.pukasoft.springDesdeCero.dao.imp;

import com.pukasoft.springDesdeCero.dao.RoleDao;
import com.pukasoft.springDesdeCero.models.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Transactional
@Repository
public class RoleDaoImp implements RoleDao {

    @PersistenceContext
    EntityManager entityManager;


    @Transactional
    @Override
    public List<Role> getAll() {
        String hsl = "FROM Role as r";
        return (List<Role>) entityManager.createQuery(hsl).getResultList();
    }

    @Transactional
    @Override
    public Role get(long id) {

        return entityManager.find(Role.class, id);
    }

    @Transactional
    @Override
    public Role registrer(Role role) {
        entityManager.merge(role);
        return role;
    }

    @Transactional
    @Override
    public Role update(Role role) {
        entityManager.merge(role);
        return role;
    }

    @Transactional
    @Override
    public void delete(long id) {
        Role role = get(id);
        entityManager.remove(role);

    }
}
