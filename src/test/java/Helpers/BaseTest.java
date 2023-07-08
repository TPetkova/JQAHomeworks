package Helpers;

import Helpers.BrowserFactory;
//import org.junit.Before;
//import org.junit.After;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    static WebDriver driver;

    @Before
    public void setup() {
        System.out.println("This is setup method");
        driver = BrowserFactory.getBrowser("edge");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void teardown() {
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void scrollToBottomOfPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void scrollToBeginningOfPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
    }
}
