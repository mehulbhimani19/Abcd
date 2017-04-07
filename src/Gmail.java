import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 13/11/2016.
 */
public class Gmail {
    protected static WebDriver driver;

    public static void main(String[] args) throws InterruptedException   // exeption
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS); // implicity wait


        driver.get("http://www.google.com/gmail");

        Thread.sleep(1000);  // you can do by try and catch as wall

        String actual = driver.getTitle();
        String ecpected = "Gmail";



        if (ecpected.equals(actual)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        driver.findElement(By.id("Email")).sendKeys("bhimani1985");
        Thread.sleep(2000);     // Every time dont need to give throws exeption

        driver.findElement(By.id("next")).click();
        driver.findElement(By.name("Passwd")).sendKeys("");
        driver.findElement(By.id("signIn")).click();

        driver.quit();


    }
}