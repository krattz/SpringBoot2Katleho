package Service;


import Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService<name,surname, Id> {
   void addUser(String name, String surname);

   void removeUser(long Id);

   void getUser(long Id);


   List<User> selectUser();

   Optional<Object> findUserById(long id);
}
