package automationjava.testng;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class frameworks
{
    WebDriver driver = null;

    @DataProvider(name="tops")
    public static Object[][] readExcel() throws IOException, InvalidFormatException
    {
        String filepath = "C:\\Users\\Tops\\Downloads";

        File file = new File(filepath);

        System.out.println("File Exists: " + file.exists());
        System.out.println("File Path: " + file.getAbsolutePath());

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheet("hybriddriven");

        int nrows = sheet.getPhysicalNumberOfRows();
        System.out.println("No of rows are: " + nrows);

        // header row skip kiya
        Object[][] data = new Object[nrows - 1][2];

        for(int i = 1; i < nrows; i++)   // row 1 se start
        {
            Row row = sheet.getRow(i);

            for(int j = 0; j < 2; j++)   // sirf 2 columns: keyword, data
            {
                Cell cell = row.getCell(j);

                if(cell != null)
                {
                    cell.setCellType(CellType.STRING);
                    data[i - 1][j] = cell.getStringCellValue();
                }
                else
                {
                    data[i - 1][j] = "";
                }
            }
        }

        workbook.close();
        return data;
    }

    @Test(dataProvider = "tops")
    public void test(String keyword, String data) throws InterruptedException, IOException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\try\\MyDriver\\mychromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        System.out.println("Keyword = " + keyword + " | Data = " + data);

        if(keyword.equalsIgnoreCase("open browser"))
        {
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        else if(keyword.equalsIgnoreCase("enter url"))
        {
            driver.get(data);
            Thread.sleep(2000);
        }
        else if(keyword.equalsIgnoreCase("enter username"))
        {
            driver.findElement(By.id("user-name")).sendKeys(data);
            Thread.sleep(2000);
        }
        else if(keyword.equalsIgnoreCase("enter password"))
        {
            driver.findElement(By.id("password")).sendKeys(data);
            Thread.sleep(2000);
        }
        else if(keyword.equalsIgnoreCase("click login"))
        {
            driver.findElement(By.id("login-button")).click();
            Thread.sleep(2000);

            if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
            {
                System.out.println("Your Test Has Been Passed...");
            }
            else
            {
                System.out.println("Your Test Has Been Failed");

                File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                File dest = new File("D:\\screenshot\\1.png");
                FileUtils.copyFile(src, dest);

                Assert.fail("Incorrect username or password...");
            }
        }
        else if(keyword.equalsIgnoreCase("click sidemenu"))
        {
            driver.findElement(By.id("react-burger-menu-btn")).click();
            Thread.sleep(2000);
        }
        else if(keyword.equalsIgnoreCase("click logout"))
        {
            driver.findElement(By.id("logout_sidebar_link")).click();
            Thread.sleep(2000);
        }
        else if(keyword.equalsIgnoreCase("close browser"))
        {
            System.out.println("Bye Bye...");
            driver.quit();
        }
    }
}

