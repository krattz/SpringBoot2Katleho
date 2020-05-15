package Service;

import Model.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class WebSecurityConfigurerTest {

    @Test
    public void configure() {
        AuthenticationManager authenticationManager = new AuthenticationManager() {
            @Override
            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
                if (authentication.isAuthenticated()){
                    System.out.println("Welcome");
                }
                else {
                    System.out.println("incorrect username and password");
                }
                return authentication;
            }
        };
        Assert.assertEquals(authenticationManager.authenticate(User.getName()), User.getName() );
    }

//    @Test
//    public void testConfigure() {
//        AuthenticationManagerBuilder authenticationManagerBuilder = ("user", "passwd");
//        ResponseEntity<String> response = webSecurityConfigurer.
//                getForEntity(URL_SECURED_BY_AUTHENTICATION, String.class);
//
//        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
//    }
}