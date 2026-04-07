package junit;

import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(Parameterized.class)
public class test4 
{
	
	String username;
	String password;
	static WebDriver driver;
	
	public test4(String username, String password) 
	{
		super();
		this.username = username;
		this.password = password;
	}
	
	@BeforeClass
	public static void openBrowser()
	{
		 driver= myconnection.connect("https://www.facebook.com/");
	}
	
	@Test
	public void loginTest()
	{
		System.out.println("running with username :" + username);
		System.out.println("running with username :"+ password);
		
		WebElement uname =  driver.findElement(By.id("email"));
		uname.clear();
		uname.sendKeys(username);
		
		WebElement pass =  driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys(password);
	}
	
	@AfterClass
	public static void quitbrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	@Parameters
	public static List<Object[]> getData()
	{
		Object obj[][] = new Object[4][2];
		
		obj[0][0] = "abc@gmail.com";
		obj[0][1] = "abc";
		
		
		obj[1][0] = "xyz@gmail.com";
		obj[1][1] = "xyz";
		
		
		obj[2][0] = "tops@gmail.com";
		obj[2][1] = "tops";
		
		
		obj[3][0] = "tech@gmail.com";
		obj[3][1] = "tech";
	
		
		return Arrays.asList(obj);
		
	}
}