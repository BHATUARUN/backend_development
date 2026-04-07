package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing1 {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\try\\MyDriver\\mychromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://careercenter.tops-int.com/");
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("mobile_number")).sendKeys("9016119982");
		 driver.findElement(By.name("password")).sendKeys("9974529558");
		 driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"page-header-user-dropdown\"]/span/img")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"page-topbar\"]/div/div/div[3]/div/div/a[3]/span")).click();
		 
		 
	}
	

}
