package Dao;

import Dao.FakeRepoInterface;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class FakeRepo implements FakeRepoInterface {
//    public FakeRepoInterface fkrepo;

    @Autowired
    public static List<User> DB = new ArrayList<>();
    static {
        DB.add(0,new User(1, User.setName("maria"), User.setSurname("Carey")));
        DB.add(1,new User(2, "Morine", "Carsey"));
        DB.add(2,new User(3, "Morning", "Josey"));
//        DB.add(3,new User(4, "Dan", "Mabote"));
    }

            @Autowired
            public String insertUser(long id, String name, String surname) {
                DB.add(new User(id, name, surname));
                return id + name + surname;
            }

            @Autowired
            public long findUserById(long id) {
                if (DB.contains(id)) {
                    System.out.println(findUserById(id));
                }
                return findUserById(id);
            }


            @Autowired
            public void deleteUser(long id) {
                DB.remove(DB.get((int) id));
            }

    @Override
    public List<User> selectUser() {
        for (User usr : DB) {
            System.out.println(usr);
        }
        System.out.println("we are here");
        return DB;
    }
}