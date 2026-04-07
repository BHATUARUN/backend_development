package automationjava.testng;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class testng9
{
	
	WebDriver driver=null;
	
	
	private String[][] readExcel() throws InvalidFormatException, IOException 
	{
		
		String[][] data=null;
		String filepath="C:\\Users\\Tops\\Downloads\\Book1.xlsx";
		File file = new File(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		Sheet sheet=workbook.getSheet("datadriven");
		
		int nrows=sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows are... "+nrows);
		data=new String[nrows][];
		for(int i=0;i<nrows;i++)//c
		{
			Row row=sheet.getRow(i);
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("no of cols are.. "+ncols);
			data[i]=new String[ncols];
			for(int j=0;j<ncols;j++)
			{
				Cell cell=row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
			}
		}
		
		
		return data;
	}
	
	
	
	@Test
	public void test() throws InvalidFormatException, IOException, InterruptedException
	{
		   int index1=0;
		
		System.setProperty("webdriver.chrome.driver", "C:\\try\\MyDriver\\mychromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		String[][] data=readExcel();
		for(int i=0;i<data.length;i++)
		{
			driver = new ChromeDriver(options);
			driver.get("https://www.saucedemo.com/");	
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys(data[i][0]);
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys(data[i][1]);
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			
			if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
			{
				System.out.println("Your Test HasBeen Passed...");
			}
			else
			{	
				index1++;
				System.out.println("Your Test Has beenFailed");
				
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				File dest=new File("C:\\screenshot\\"+index1+".png");
				FileUtils.copyFile(src, dest);
				Thread.sleep(2000);
				Assert.fail("Incorrect username or password...");
			}
			
			Thread.sleep(2000);
			System.out.println("Bye Bye...");
			driver.close();
			
		}
	}

	
}