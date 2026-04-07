package automationjava.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class testng7 {
	@Test(priority = 1)
	public void titlecheck (ITestContext i)
	{
		WebDriver driver = myconnection.connect("https://www.facebook.com/");
		i.setAttribute("mydriver", driver);
		assertequals(driver.getClass(),"facebook");
	}

	private void assertequals(Class<? extends WebDriver> class1, String string) {
		// TODO Auto-generated method stub
		
	}
    @Test(priority = 2)
    public void login(ITestContext i) throws InterruptedException
    {
    	WebDriver driver = myconnection.connect("https://www.facebook.com/");
    	driver.findElement(By.xpath("//*[@id=\"_R_64qjbjb9pb6amH1_\"]")).sendKeys("yoyo87@gmail.com");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"_R_66qjbjb9pb6amH1_\"]")).sendKeys("pass");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div"));
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div")).click();
    	Thread.sleep(2000);
    	assertEquals(driver.getTitle(), "Fb");
	}
    	
}
    

