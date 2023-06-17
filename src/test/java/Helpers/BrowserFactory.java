package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
    public static WebDriver getBrowser(String browserType) {
        switch (browserType) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                return new ChromeDriver();
            case "edge":
                System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
                return new EdgeDriver();
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }
    }
}
