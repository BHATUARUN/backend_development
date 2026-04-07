
package junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(Parameterized.class)
public class test2 {

    String username;
    String password;

    public test2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    static WebDriver driver;

    @BeforeClass
    public static void openbrowser() {
        driver = myconnection.connect("https://careercenter.tops-int.com/");
    }

    @Test
    public void logintest() {

        WebElement uname = driver.findElement(By.id("mobile_number"));
        uname.clear();
        uname.sendKeys(username);

        WebElement pass = driver.findElement(By.name("password"));
        pass.clear();
        pass.sendKeys(password);
    }

    @Parameters
    public static Collection<Object[]> getdata() {

        Object data[][] = new Object[2][2];

        data[0][0] = "dfdf3@gmail.com";
        data[0][1] = "1234";

        data[1][0] = "test@gmail.com";
        data[1][1] = "5678";

        return Arrays.asList(data);
    }
}
