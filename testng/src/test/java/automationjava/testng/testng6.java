	package automationjava.testng;
	
	
	import static org.testng.Assert.assertEquals;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.ITestContext;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	
	
	public class testng6 {
		
		
		
		@Test(priority = 1)
		public void titleCheck(ITestContext i)
		{
			WebDriver driver = myconnection.connect("https://www.facebook.com/");
			i.setAttribute("myDriver", driver);
			assertEquals(driver.getTitle(), "Facebook");
		}
		
		@Test(priority = 2)
		public void login(ITestContext i)
		{
			WebDriver driver = myconnection.connect("https://www.facebook.com/");
			driver.get("https://www.facebook.com/");
			i.setAttribute("myDriver", driver);
			
			driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("pass");
			driver.findElement(By.name("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div/span")).click();
			assertEquals(driver.getTitle(), "Fb");
		}
		
	}