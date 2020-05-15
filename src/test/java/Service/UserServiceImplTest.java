package Service;

import org.junit.Assert;
import org.junit.Test;

class UserServiceImplTest {

    @Test
    void getUser() {
        UserServiceImpl usr = new UserServiceImpl();
            String [] values = {};
            for(int i = 0; i <4; i++) {
                values[i]=  usr.getUser(1);
            }
            Assert.assertEquals(values.length, 5);
        }
    }