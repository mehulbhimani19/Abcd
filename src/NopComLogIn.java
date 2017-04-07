import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;

/**
 * Created by Mehul on 14/11/2016.
 */
public class NopComLogIn

{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String Email ="mehulbhimani19161516171551@yahoo.com";   // need to change email address all time

        driver.get("http://demo.nopcommerce.com/");

        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys(Email);
        driver.findElement(By.name("Password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();

        String actual = driver.findElement(By.linkText("mehulbhimani19161516171551@yahoo.com")).getText();

        String expected = Email;

        if (expected.equals(actual))
               {
                  System.out.println("Pass");
               }
                 else {
                 System.out.println("fail");
                }

     driver.quit();

    }
}
