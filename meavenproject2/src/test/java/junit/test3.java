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
public class test3 {

    String username;
    String password;

    public void test2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    static WebDriver driver;

    @BeforeClass
    public static void openbrowser() {
        driver = myconnection.connect("https://careercenter.tops-int.com/");
    }
}
