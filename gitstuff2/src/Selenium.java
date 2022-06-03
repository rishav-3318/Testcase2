import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class Selenium {
    static {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2021.2.3\\chromedriver.exe");
    }
   // WebDriver driver;

//    public void OpenBrowser(){
//       new ChromeDriver();
//       driver.get("https://www.flipkart.com/");
//       driver.manage().window().maximize();

//    }

//    public void flipkartplus(){
//

//    }
    public static void main(String []args) throws InterruptedException {
         WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
//        String Parentwindowhandle=driver.getWindowHandle();
//        String Subwindowhandle=null;
//        Set<String>handles=driver.getWindowHandles();
//        Iterator<String>iterator= handles.iterator();
//        while(iterator.hasNext()){
//            Subwindowhandle= iterator.next();
//
//        }
//        driver.switchTo().window(Subwindowhandle);
//        driver.findElement(By.linkText("Login")).click();
//        driver.findElement(By.xpath("//span[contains(.,'Enter Email/Mobile number')]")).sendKeys("8210423318");
        driver.findElement(By.className("fk-modal-visible")).click();
        String actual=driver.getTitle();
//        String title=driver.findElement(By.className("_3qX0zy"));
        String expected="Flipkart Plus";

        Assert.assertEquals(actual,expected);
        System.out.println(actual);

        Thread.sleep(4000);
        driver.close();



    }


}

