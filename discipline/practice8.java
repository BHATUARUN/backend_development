package discipline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class practice8 {
	public static void main(String[] args) 
	{
	  
	  WebDriver driver = new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver","C:\\try\\MyDriver\\mychromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver connection = myconnection.connect("C:\\try\\MyDriver\\mychromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver.get("https://careercenter.tops-int.com/");
	}
           
}
