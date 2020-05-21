package Dao;

import Dao.FakeRepoInterface;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class FakeRepo implements FakeRepoInterface {
    @Autowired
    public static HashMap<Long, User> DB;
    static{
        DB = new HashMap<Long, User>() {
            {
                put((long) 1, new User(1, "Maria","Carey"));
                put((long) 2, new User(2, "Morine","Carsey"));
                put((long) 3, new User(3, "Morning","Josey"));
                put((long) 4, new User(4, "Dan","Chopper"));
            }
        };
    }


    @Autowired
    public String insertUser(long id, String name, String surname) {
        DB.put((1l), new User(id, name, surname));
        return id + name + surname;
    }

    @Autowired
    public User findUserById(long id) {
        return DB.get(id);
    }

    @Autowired
    public void deleteUser(long id) {
        DB.remove(DB.get((int) id));
    }
}