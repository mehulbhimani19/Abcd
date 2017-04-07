import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 15/11/2016.
 */
public class YoutubeSong
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/?hl=en-GB&gl=GB");
        driver.findElement(By.id("masthead-search-term")).sendKeys("Kala Chashma - Full Video | Baar Baar Dekho | Sidharth Katrina | Prem Hardip Badshah Neha Indeep B ");
        driver.findElement(By.id("search-btn")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Kala Chashma - Full Video | Baar Baar Dekho | Sidharth Katrina | Prem Hardip Badshah Neha Indeep B')]")).click();

        String expected = "Published on Oct 7, 2016";
        String actual = driver.findElement(By.className("watch-time-text")).getText();

//        if (actual.equals(expected)){
//            System.out.println("Pass");
//        } else {
//            System.out.println("fail");
//        }
        Assert.assertEquals(expected,actual,"\nfail");
        System.out.println(" This test is pass");
//        driver.quit();

    }

}
