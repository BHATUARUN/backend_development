package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class beginner1{
	public static void main(String[] args) 
	{
		WebDriver driver = myconnection.connect("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
	}
}