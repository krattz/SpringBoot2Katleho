package Service;

import Dao.FakeRepoInterface;
import Dao.FakeRepo;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class  UserServiceImpl implements FakeRepoInterface {

    public String addUser(long Id , String name, String surname){
        insertUser(Id,name,surname);
        return   name+ " entered";
    }

    public void removeUser(long Id) {
        deleteUser(Id);
    }

@Autowired
@Cacheable("name")
    public String getUser(long Id) {

    try
    {
        System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
        Thread.sleep(1000*5);
    }
    catch (InterruptedException e)
    {
        e.printStackTrace();
    }
    return "Hello " +FakeRepo.DB.get((int)Id).getName();
    }

    @Override
    public String insertUser(long id, String name, String surname) {
        FakeRepo.DB.put(1l, new User(id, name, surname));
        return id+" "+name+" "+surname;
    }
    @Override
    public User findUserById(long id) {
        return FakeRepo.DB.get(id);
    }

    @Override
    public void deleteUser(long id) {
        if(FakeRepo.DB.containsKey(findUserById(id))){
            removeUser(id);
        }
        System.out.println(findUserById(id) + " removed");
    }
}
