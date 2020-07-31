package Service;

import java.util.Optional;

public interface UserService<name,surname, Id> {
   String addUser(long Id, String name, String surname);

   void removeUser(long Id);

   String getUser(long Id);


}
