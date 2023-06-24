package Test;

import Helpers.BrowserFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    @Before
    public void setup() {
        driver = BrowserFactory.getBrowser("edge");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
