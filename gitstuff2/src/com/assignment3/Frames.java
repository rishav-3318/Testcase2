package com.assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Frames {
    WebDriver driver;
    static{
        System.setProperty("webdriver.chrome.driver","\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2021.2.3\\chromedriver.exe");
    }
    @Test
    public void openBrowser(){
        driver=new ChromeDriver();


    }
    @Test(priority = 1)
    public void testloginheroku() throws InterruptedException {
        driver.get("https://admin:admin@the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(.,'Basic Auth')]")).click();

    }
    @Test(priority = 2)
    public void testnestedframe(){

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[22]/a")).click();
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame((WebElement) By.name("frame-left"));

      String text= driver.findElement(By.name("frame-left")).getText();
      System.out.println(text);


    }

}
