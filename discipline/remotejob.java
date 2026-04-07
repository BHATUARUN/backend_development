package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class remotejob {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = myconnection.connect("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
