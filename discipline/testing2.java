package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class testing2 {
	public static void main(String[] args) {
		WebDriver driver = myconnection.connect("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[5]/div/a/div/div[1]/div/span/span")).click();
		
		WebElement fname = driver.findElement(By.xpath("//*[@id=\"_R_1cl2p4jikacppb6amH1_\"]"));fname.sendKeys("tops");
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"_R_1kl2p4jikacppb6amH1_\"]"));lname.sendKeys("technologies");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("20");
	
		
		//*[@id="_r_9_"]/div
		
	}

}
