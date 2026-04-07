package junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class test5 {

    String username;
    String password;

    public test5(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Test
    public void loginTest() {
        System.out.println("Username: " + username + " Password: " + password);
    }

    @Parameters
    public static Collection<Object[]> getData() {

        Object data[][] = {
                {"abc@gmail.com", "abc"},
                {"xyz@gmail.com", "xyz"},
                {"tops@gmail.com", "tops"},
                {"tech@gmail.com", "tech"}
        };

        return Arrays.asList(data);
    }
}