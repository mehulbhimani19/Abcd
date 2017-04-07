import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Mehul on 14/11/2016.
 */
public class NextCheckout
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // implicity wait

        Wait wait = new FluentWait(driver)

                .withTimeout(30, SECONDS)

                .pollingEvery(5, SECONDS)

                .ignoring(NoSuchElementException.class);  // fluent wait

        driver.get("http://www.next.co.uk/");
        driver.findElement(By.className("DepartmentText")).click();
        System.out.println("Category selected ");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@href='http://www.next.co.uk/men/fragrance']")).click();
        driver.findElement(By.xpath("//a[@href='/shop/gender-men-category-fragrances-0']")).click();
//        Select select = new Select(driver.findElement(By.id("ssize5")));
//        select.selectByVisibleText("50ml");

        driver.findElement(By.className("TitleText")).click();
       driver.findElement(By.xpath("//a[contains(@href, 'javascript:;')]")).click();
        System.out.println("Item in checkout bag");
        driver.findElement(By.xpath("//a[@href='http://www.next.co.uk/shop/gender-men-category-fragrances-0']")).click();
//        driver.findElement(By.linkText("Men's Fragrances")).click();
        driver.findElement(By.linkText("Signature Eau De Toilette Fragrance Gift Set")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'javascript:;')]")).click();
        System.out.println("2nd item in basket ");

            driver.findElement(By.linkText("Home")).click();
        System.out.println("back to home ");
        driver.findElement(By.className("DepartmentText")).click();
        driver.findElement(By.linkText("Christmas Cards")).click();
        driver.findElement(By.linkText("20 Santa Cards")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'javascript:;')]")).click();
        System.out.println("3rd item is selected ");
//        driver.findElement(By.xpath("//a[href='http://www.next.co.uk/secure/checkout/transfer']")).click();

        driver.findElement(By.linkText("CHECKOUT")).click();

        String actual = driver.findElement(By.id("itemCount")).getText();
        String expected = "3";
        if (expected.equals(actual))
        {
            System.out.println("This Test is Passed");
        }
        else
            {
                System.out.println("Test Failed");
            }











       driver.quit();






    }
}
