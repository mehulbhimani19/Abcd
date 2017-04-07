import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 14/11/2016.
 */
public class TescoBasket
{

    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.tesco.com/");
        driver.findElement(By.linkText("Groceries")).click();
        driver.findElement
                (By.xpath("//a[@href='http://www.tesco.com/groceries/department/default.aspx?N=4294792797&Ne=4294793660']")).click();
        driver.findElement(By.id("yui_3_13_0_1_1479126133053_331")).click();
        driver.findElement
                (By.xpath("//a[@href='http://www.tesco.com/groceries/product/browse/default.aspx?N=4293307719&Ne=4294793660']")).click();


    }
}
