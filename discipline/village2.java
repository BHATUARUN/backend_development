package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class village2 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = myconnection.connect("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement menu =driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[1]/div/a"));
		Actions act = new Actions(driver);
		act.moveToElement(menu).perform();
		Thread.sleep(2000);
	}
	

} // WebDriver driver = myconnection.connect("https://www.amazon.in/");
 //  T hread.sleep(2000);
 //  WebElement menu =driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[1]/div/a"));
 //  Actions act = new Actions(driver);
   //act.moveToElement(menu).perform();
 //  Thread.sleep(2000);
