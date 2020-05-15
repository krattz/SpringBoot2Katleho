package Model;


import Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;

public class User {
    private static long Id;
        private static String name;
        private static String surname;

    public User(long id, String name, String surname) {

        Id = id;
        this.name = name;
        this.surname = surname;

    }

    public static long getId() {
        return Id;
    }
    public long setId(long id) {
        Id = id;
        return id;
    }
    public static String setName(String name){
        setName(name);
        return name;
    }
    public static String getName() {
        setName(name);
        return name;
    }
    @Autowired
    public static String getSurname() {
        setSurname(surname);
        return surname;
    }
    public static String setSurname(String surname) {
    return surname;
    }
}
