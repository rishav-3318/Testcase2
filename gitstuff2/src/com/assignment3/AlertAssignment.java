package com.assignment3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertAssignment {
    static{
        System.setProperty("webdriver.chrome.driver","\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2021.2.3\\chromedriver.exe");
    }


    public static void main(String []args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(.,'JavaScript Alerts')]")).click();
        driver.findElement(By.xpath("//button[contains(.,'Click for JS Prompt')]")).click();
        String text=driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys("Test");
        Thread.sleep(4000);
        driver.switchTo().alert().accept();
        System.out.println(text);
        Thread.sleep(4000);
        driver.close();

    }

}
