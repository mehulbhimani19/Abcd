import javafx.scene.input.DataFormat;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;

/**
 * Created by Mehul on 13/11/2016.
 */
public class Nopcom extends Utility

{
    public static String randomDate ()
   {
    SimpleDateFormat formet = new SimpleDateFormat("ddmmyyHHmmss"); // email
    return formet.format(new Date());
    }

    protected static WebDriver driver;

    public static void main(String[] args) throws InterruptedException

    {
        Utility obj = new Utility();


        driver = new FirefoxDriver();

        String email = "mehulbhimani19" + randomDate() + "@yahoo.com";  // dont need to wrght email all time for registration

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


        driver.get("http://demo.nopcommerce.com/");

//        String actuale  = driver.getTitle();
//        String expected = "Your registration completed";

        driver.findElement(By.linkText("Register")).click();
//        driver.findElement(By.name("Gender")).click();
        clickonElement(By.name("Gender"));

//           driver.findElement(By.name("FirstName")).sendKeys("Mehul1");
        enterText(By.name("FirstName"), "Mehul1");

//        driver.findElement(By.name("LastName")).sendKeys("bhimani");
        enterText(By.name("LastName"), "bhimani");


        Select select = new Select(driver.findElement(By.name("DateOfBirthDay")));
        select.selectByValue("1");

        new Select(driver.findElement(By.name("DateOfBirthMonth"))).selectByIndex(1);
        new Select(driver.findElement(By.name("DateOfBirthYear"))).selectByVisibleText("1985");

        driver.findElement(By.name("Email")).sendKeys(email);

        System.out.println(email);  // just to know its gone thourw to email

        driver.findElement(By.id("Company")).sendKeys("tesco");

        driver.findElement(By.id("Password")).sendKeys("123456");

        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");

//        driver.findElement(By.id("register-button")).click();
        clickonElement(By.id("register-button"));
        System.out.println("Registrations completed ");  // to conform


        String actual = driver.findElement(By.xpath("//div[@class='result']")).getText();

        String expected = "Your registration completed";
        if (expected.equals(actual))
        {
            System.out.println(" Test Pass ");
        } else
        {
            System.out.println("Test Fail");
        }
//       Assert.assertEquals(expected,actual,"\n fail");   // other way to assert

//        Assert.assertEquals(actual.equals(expected), false); // other way to assert



        driver.findElement(By.name("register-continue")).click();

        driver.findElement(By.linkText("Log out")).click();
//            driver.findElement(By.linkText("//a[contains(text(),'Log out')]")).click();
            System.out.println("Logout successfully");
            driver.findElement(By.linkText("Log in")).click();
            driver.findElement(By.id("Email")).sendKeys(email);
            driver.findElement(By.name("Password")).sendKeys("123456");
            driver.findElement(By.cssSelector("input.button-1.login-button")).click();
            System.out.println("LogIn successfully ");

        Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
        System.out.println("Test Pass");




//            driver.quit();





    }
}
