package Service;
import Model.User;
import org.junit.Assert;
import org.junit.Test;

public class SpringBootTests {
    UserServiceImpl userImpl = new UserServiceImpl();

    @Test
    public void addUser() {
        Assert.assertEquals(true, userImpl.list.contains("Katleho"));
    }


    @Test
    void removeUser() {
        Assert.assertEquals(true, userImpl.list.remove(1));
    }

    @Test
    void getUser() {
        Assert.assertEquals(false, userImpl.list.isEmpty());
    }
}