package Service;

import Dao.FakeRepoInterface;
import Dao.FakeRepo;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class  UserServiceImpl implements FakeRepoInterface {

    @Autowired
    public LinkedList<Dao.FakeRepo> getList() {
        return getList();
    }

    @Autowired
    LinkedList<FakeRepo>list = new LinkedList();

    public String addUser(long Id , String name, String surname){
        insertUser(Id,name,surname);
      return  User.getId() + User.getName() + User.getSurname();
    }

    public void removeUser(long Id) {
        deleteUser(findUserById(Id));
    }
@Autowired
    public String getUser(long Id) {
        if(FakeRepo.DB.contains(findUserById(Id))){
//            System.out.println("Hello" + FakeRepo.DB.get((int) Id));
        }
        return "Hello "+ FakeRepo.DB.get((int)Id);
    }
    @Override
    public String insertUser(long id, String name, String surname) {
    return id+name+surname;
    }
    @Override
    public long findUserById(long id) {
        return 0;
    }

    @Override
    public void deleteUser(long id) {
        if(FakeRepo.DB.contains(findUserById(id))){
            removeUser(id);
        }
        System.out.println(findUserById(id) + " removed");
    }

    @Autowired
    public List<User> selectUser() {
        System.out.println("trying");
        return FakeRepo.DB;
    }
}
