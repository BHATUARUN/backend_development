package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.webdriver2test;

public class testing3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = myconnection.connect("https://demoqa.com/automation-practice-form");
		WebElement fname = driver.findElement(By.id("firstName"));fname.sendKeys("tops");
		WebElement lname = driver.findElement(By.id("lastName"));lname.sendKeys("technologies");
		WebElement email = driver.findElement(By.id("userEmail"));email.sendKeys("yadavji7@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		WebElement unumber = driver.findElement(By.id("userNumber")); unumber.sendKeys("9016119984");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
		
		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText("October");
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByVisibleText("2026");
		driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--026') and not(contains(@class,'outside-month'))]")).click();
		WebElement subjects = driver.findElement(By.id("subjectsInput"));
		subjects.sendKeys("English");
		Thread.sleep(1000);
		subjects.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-3\"]")).click();
		
		WebElement uaddress = driver.findElement(By.id("currentAddress")); uaddress.sendKeys("Nagvadar");
		driver.findElement(By.xpath("//div[@id='state']")).click();
		driver.findElement(By.xpath("//div[text()='NCR']")).click();
		driver.findElement(By.xpath("//div[@id='city']")).click();
		driver.findElement(By.xpath("//div[text()='Gurgaon']")).click();
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("closeLargeModal")).click();
	    
		
		
		
		
		
	}

}
