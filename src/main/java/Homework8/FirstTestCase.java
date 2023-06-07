package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    public void login() {
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

    }

    public void closeBrowser() {
        driver.quit();
    }

    public static void main(String args[]) {
        FirstTestCase test = new FirstTestCase();
        test.setUp();
        test.login();
        test.closeBrowser();
    }



}
