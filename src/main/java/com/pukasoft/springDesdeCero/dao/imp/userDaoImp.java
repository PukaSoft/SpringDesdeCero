package com.pukasoft.springDesdeCero.dao.imp;

import com.pukasoft.springDesdeCero.dao.UserDao;
import com.pukasoft.springDesdeCero.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Transactional
@Repository
public class userDaoImp implements UserDao {

    @PersistenceContext
    EntityManager entityManager;


    @Transactional
    @Override
    public List<User> getAll() {
        String hsl = "FROM User as u";
        return (List<User>) entityManager.createQuery(hsl).getResultList();
    }

    @Transactional
    @Override
    public User get(long id) {

        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public User registrer(User user) {
        entityManager.merge(user);
        return user;
    }

    @Transactional
    @Override
    public User update(User user) {
        entityManager.merge(user);
        return user;
    }

    @Transactional
    @Override
    public void delete(long id) {
        User user = get(id);
        entityManager.remove(user);

    }
}
