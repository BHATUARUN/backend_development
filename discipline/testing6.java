package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testing6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = myconnection.connect("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"_R_64qjbjb9pb6amH1_\"]")).sendKeys("yadavji");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"_R_66qjbjb9pb6amH1_\"]")).sendKeys("7777777");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
