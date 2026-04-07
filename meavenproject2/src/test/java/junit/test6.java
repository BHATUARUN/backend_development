package junit;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Parameterized.class)
public class test6 {

    String username;
    String password;
    WebDriver driver;

    public test6(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][] {
            {"abc@gmail.com", "abc"},
            {"xyz@gmail.com", "xyz"},
            {"tops@gmail.com", "tops"},
            {"tech@gmail.com", "tech"}
        });
    }

    @Before
    public void openBrowser() {
        // 1️⃣ Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); // change path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void loginTest() {
        System.out.println("Running test with:");
        System.out.println("Username: " + username + " | Password: " + password);

        // 2️⃣ Wait until elements visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));

        uname.clear();
        uname.sendKeys(username);

        pass.clear();
        pass.sendKeys(password);
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}