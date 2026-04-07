package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class village {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = myconnection.connect("https://www.google.com/");
		Thread.sleep(2000);
		WebElement box = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		Actions act = new Actions(driver);
		act.click(box).sendKeys("vikings").perform();
		Actions act1 = new Actions(driver);
		Thread.sleep(2000);
		act1.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	    act1.sendKeys(Keys.DELETE).perform();
	    Thread.sleep(2000);
	    
	    Actions act2 = new Actions (driver);
	   // act2.click(box).sendKeys("bjron ironside").perform();
	 //   Thread.sleep(2000);
	    act2.click(box).sendKeys("bjron ironside").sendKeys(Keys.ENTER).perform();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
