package Service;

import Dao.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
@Autowired
    FakeRepo repo;

    @Override
    public void removeUser(long Id) {
        System.out.println(repo.findUserById(Id).getName() + " removed");
        repo.deleteUser(Id);
    }

    @Override
    public String getUser(long Id) {

        return "Hello " + repo.DB.get(Id).getName();
    }

    public String addUser(long Id, String name, String surname) {
        repo.insertUser(Id, name, surname);

        return name + " entered";
    }
}