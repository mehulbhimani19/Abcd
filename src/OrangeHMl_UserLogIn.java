import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 15/11/2016.
 */
public class OrangeHMl_UserLogIn {
    public static String randomDate() {
        SimpleDateFormat formet = new SimpleDateFormat("ddmmyyHHmmss"); // email
        return formet.format(new Date());
    }


    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String Eusername = "Gujratindia" + randomDate() + "yahoo.com";

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);  // implicit wait
        driver.get("http://opensource.demo.orangehrmlive.com/");


        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin");

//        WebDriverWait wait = new WebDriverWait(driver,12);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("bunLogin")));     // explicit wait particular for this action

        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.linkText("Add Employee")).click();
        driver.findElement(By.id("firstName")).sendKeys("Gujarat");
        driver.findElement(By.id("lastName")).sendKeys("India");
        driver.findElement(By.id("chkLogin")).click();

        driver.findElement(By.name("user_name")).sendKeys(Eusername);
        System.out.println(Eusername);
        driver.findElement(By.name("user_password")).sendKeys("Gujaratindia");
        driver.findElement(By.name("re_password")).sendKeys("Gujaratindia");

        Select select = new Select(driver.findElement(By.name("status")));
        select.selectByVisibleText("Enabled");
        System.out.println(" Enabled selected ");

        driver.findElement(By.id("btnSave")).click();

        System.out.println("Registration detail saved ");
        driver.findElement(By.linkText("Welcome Admin")).click();

        driver.findElement(By.linkText("Logout")).click();
        System.out.println(" Admin Successfully logout ");
        driver.findElement(By.name("txtUsername")).sendKeys(Eusername);
        driver.findElement(By.name("txtPassword")).sendKeys("Gujaratindia");
        driver.findElement(By.id("btnLogin")).click();
        System.out.println("Employee successfully login ");


        String actual = driver.findElement(By.linkText("Welcome Gujarat")).getText();
        String expected = "Welcome Gujarat";

        if (actual.equals(expected))
        {
            System.out.println(" Your test is Pass");

        } else {
            System.out.println("Your test is Fail");
        }


    }


}