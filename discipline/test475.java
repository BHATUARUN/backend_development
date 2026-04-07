package discipline;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class test475{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = myconnection.connect("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
		WebElement to = driver.findElement(By.id("trash"));
		
		Actions builder = new Actions(driver);
		Action dd =builder.clickAndHold(from).moveToElement(to).release().build();
		
		dd.perform();
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}
}