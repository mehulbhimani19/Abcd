import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.DriverManager;

/**
 * Created by Mehul on 13/11/2016.
 */

public class  Utility
{

//    protected static WebDriver driver;

    public static void enterText(By by, String text)
    {

        driver.findElement(by).clear();   // to clear filed before entering anything
        driver.findElement(by).sendKeys(text);
    }
    public static void clickonElement(By by)
    {
        driver.findElement(by).click();

    }


}
