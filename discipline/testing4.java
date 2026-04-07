package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testing4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = myconnection.connect("https://careercenter.tops-int.com/");
		driver.findElement(By.id("mobile_number")).sendKeys("9016119982");
		Thread.sleep(2000);
		driver.findElement(By.id("password-input")).sendKeys("9974529558");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"page-header-user-dropdown\"]/span/span/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"page-topbar\"]/div/div/div[3]/div/div/a[3]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
