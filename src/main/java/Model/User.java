package Model;


import Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;

public class User {
    private long Id;
        private String name;
        private String surname;

    public User(long id, String name, String surname) {

        Id = id;
        this.name = name;
        this.surname = surname;

    }

    public long getId() {
        return Id;
    }
    public long setId(long id) {
        Id = id;
        return id;
    }
    public String setName(String name){
        return name;
    }

    public String getName() {
        setName(name);
        return name;
    }

    public String getSurname() {
        setSurname(surname);
        return surname;
    }
    public String setSurname(String surname) {
    return surname;
    }
}
