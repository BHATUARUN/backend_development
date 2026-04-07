package automationjava.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testng4
{
	static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser()
	{
		driver = myconnection.connect("https://www.facebook.com/");
		
	}
	
	@Test(dataProvider = "dp")
	public void logintest(String email, String pass)
	{
		WebElement username =  driver.findElement(By.name("email"));
		username.clear();
		username.sendKeys(email);
		WebElement password =  driver.findElement(By.name("pass"));
		password.clear();
		password.sendKeys(pass);
	}
	
	@DataProvider(name="dp")
	public static Object[][] data()
	{
		Object obj[][] = new Object[3][2];
		
		obj[0][0] = "tops@gmail.com";
		obj[0][1] = "tops123";
		
		obj[1][0] = "abc@gmail.com";
		obj[1][1] = "tops123";
		
		obj[2][0] = "xyz@gmail.com";
		obj[2][1] = "tops123";
		
		return obj;
	}
}
