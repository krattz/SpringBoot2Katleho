package Dao;

import Model.User;

import java.util.List;

public interface FakeRepoInterface< id, name, surname> {
   String insertUser(long id, String name, String surname);

   long findUserById(long id);

   void deleteUser(long id);

   List<User> selectUser();

}
