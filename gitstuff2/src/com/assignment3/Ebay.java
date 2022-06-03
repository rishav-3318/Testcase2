package com.assignment3;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.File;
import java.util.List;

public class Ebay {
    static{
        System.setProperty("webdriver.chrome.driver","\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2021.2.3\\chromedriver.exe");
    }
    WebDriver driver;
    @Test(priority = 1)
    public void testopenbrowser()  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test(priority=2)
    public void testebay(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//input[@aria-label='Search for anything']")).sendKeys("Apple watch");
        driver.findElement(By.xpath("//input[@value='Search']")).submit();
        List<WebElement> price=driver.findElements(By.xpath("s-item__price"));
        int count= price.size();
        System.out.println(count);
        for(int i=0;i<count;i++){
            WebElement alllist=price.get(i);
            String text=alllist.getText();
            System.out.println(text);

        }
    }
    @Test(priority = 3)
    public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }
}








