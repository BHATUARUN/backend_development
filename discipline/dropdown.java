package discipline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropdown {
	public static void main(String[] args)
	{
	    WebDriver driver = myconnection.connect("https://www.techlistic.com/p/demo-selenium-practice.html");
	    WebElement text = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]"));
	    System.out.println(text);
	}

	public static void selectbyvisibletext(String string) {
		// TODO Auto-generated method stub
		
	}

}
