package com.pukasoft.springDesdeCero.services;

import com.pukasoft.springDesdeCero.dao.UserDao;
import com.pukasoft.springDesdeCero.models.User;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    //Trae todos los usuarios
   public List<User> getAll(){
        return userDao.getAll();
    }

    //Trae un usuario
    public User get(long id){
        return userDao.get(id);
    }

    //Registro un usuario
    public void registrer(User user){
        //TODO : Regitrar en la base de datos
        String hash = genarateHash(user.getPassword());
        user.setPassword(hash);
        userDao.registrer(user);
    }

    //Actualizar un usuario
    public User update(User user){
        //TODO : actualizar en la base de datos
        return userDao.update(user);
    }

    //Eliminarr un usuario
    public void delete(long id){
        //TODO : actualizar en la base de datos
        userDao.delete(id);
    }

    private String genarateHash(String password){
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        return argon2.hash(1,1024 * 1,1,password);
   }

   public User login(User user){
    return userDao.login(user);
   }


}
