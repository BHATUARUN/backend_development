package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class villages {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = myconnection.connect("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[5]/div/a")).click();
	//	driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[7]/ul/li[5]/span/a/span")).click();
	//	Thread.sleep(2000);
		
		
		
	}

}
