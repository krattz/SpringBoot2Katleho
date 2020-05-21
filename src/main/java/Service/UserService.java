package Service;

import java.util.Optional;

public interface UserService<name,surname, Id> {
   void addUser(String name, String surname);

   void removeUser(long Id);

   String getUser(long Id);

   Optional<Object> findUserById(long id);
}
