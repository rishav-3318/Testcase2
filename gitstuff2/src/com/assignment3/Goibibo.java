package com.assignment3;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Goibibo {
    static{
        System.setProperty("webdriver.chrome.driver","\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2021.2.3\\chromedriver.exe");
    }

    public static void main(String []args) throws AWTException, InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.goibibo.com/");
        driver.findElement(By.xpath("//span[contains(.,'Round trip')]")).click();
        driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("New York");
        Thread.sleep(4000);

        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.id("gosuggest_inputDest")).sendKeys("Seattle");

        Thread.sleep(4000);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.id("departureCalendar")).click();
        driver.findElement(By.xpath("//div[@aria-label='Fri Dec 10 2021']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Return']")).click();
        driver.findElement(By.xpath("//div[@aria-label='Sun Dec 12 2021']")).click();
        driver.findElement(By.xpath("//Button[@value='Search']")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/button")).click();
        WebDriver webdriver = null;
        driver.close();
    }
}
