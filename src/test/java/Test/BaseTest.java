package Test;

import Helpers.BrowserFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    WebDriver driver;

    @Before
    public void setup() {
        driver = BrowserFactory.getBrowser("edge");
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
