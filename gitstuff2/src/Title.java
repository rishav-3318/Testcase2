import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

public class Title {
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2021.2.3\\chromedriver.exe");
    }
    @Test
    public void gettitle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/plus");
        driver.manage().window().maximize();
        String actual = driver.getTitle();


        Assert.assertEquals(actual, actual);
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().to("https://www.flipkart.com/plus");
        String url=  driver.getCurrentUrl();
        List<WebElement>list= driver.findElements(By.tagName("a"));
        int count=list.size();
        System.out.println(count);
        for(int i=0;i<count;i++) {
            WebElement alllinks = list.get(i);
            String text = alllinks.getText();
            System.out.println(text);

        }
        Thread.sleep(4000);
        driver.close();
    }
}


