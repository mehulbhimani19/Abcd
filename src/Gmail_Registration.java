import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static com.sun.deploy.config.JREInfo.clear;

/**
 * Created by Mehul on 13/11/2016.
 */
public class Gmail_Registration
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


//        driver.get("https://www.google.com/gmail/about/");
//        driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();
        //        driver.findElement(By.id("FirstName")).sendKeys("nicol");
//        driver.findElement(By.name("LastName")).sendKeys("Gam");


        driver.get("http://www.google.com/mail");
        driver.findElement(By.linkText("Create account")).click();
        driver.findElement(By.id("FirstName")).sendKeys("gam");
        driver.findElement(By.id("LastName")).sendKeys("nicol");
        driver.findElement(By.name("GmailAddress")).sendKeys("gamnicol123");
        System.out.println("Email accepted ");
        driver.findElement(By.name("Passwd")).sendKeys("123gamnicol");
        driver.findElement(By.name("PasswdAgain")).sendKeys("123gamnicol");
        System.out.println(" Password  match and conform ");
        System.out.println("Click on Month");


        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("BirthMonth"))).click().sendKeys(Keys.UP.NUMPAD7).sendKeys(Keys.ENTER).build().perform();
        System.out.println("Month selected ");

//        Select select = new Select(driver.findElement(By.xpath("//div[@id=':7']/div")));
//        select.selectByVisibleText("July");
        driver.findElement(By.id("BirthDay")).sendKeys("1");
//        driver.findElement(By.id("birthyear-placeholder")).sendKeys("1");
        driver.findElement(By.id("BirthYear")).sendKeys("1990");

        action.moveToElement(driver.findElement(By.id("Gender"))).click().sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
//        driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("07574006958");
        driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("bhimani1985@gmail.com");
        driver.findElement(By.id("submitbutton")).click();
        action.moveToElement(driver.findElement(By.id("tos-scroll"))).click().sendKeys(Keys.END).sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.findElement(By.id("iagreebutton")).click();
        driver.findElement(By.id("next-button")).click();










    }
}