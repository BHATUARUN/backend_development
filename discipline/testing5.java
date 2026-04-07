package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class testing5 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = myconnection.connect("https://careercenter.tops-int.com/");
		driver.findElement(By.id("mobile_number")).sendKeys("9016119982");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("9974529558");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-nav\"]/div[1]/div[2]/div/div/div/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"menuEnrollments\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[4]/div/div/div[2]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.id("checkpointTypeFilter")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("checkpointTypeFilter"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Quiz");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"page-header-user-dropdown\"]/span/span/span[1]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[4]/div/div/div[2]/div/div/div/div[1]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[4]/div/div/div[2]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"curriculum\"]/div[2]/div/div[1]/div[1]/div/div[2]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"page-header-user-dropdown\"]/span/span/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"page-topbar\"]/div/div/div[3]/div/div/a[3]/span")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}//*[@id="page-header-user-dropdown"]/span/span/span[1]

}
