package StepDefinitions;

import Helpers.BaseTest;
import Page.HomePage;
import Page.LoginPage;
import Page.OrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginSteps {
    private LoginPage loginPage;
    private HomePage homePage;
    private OrderPage orderPage;
    WebDriver driver;

    public LoginSteps() {
        driver = BaseTest.getDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        orderPage = new OrderPage(driver);
    }

//    @Test
//    public void test1_SuccessfulLogin() {
//        loginPage = new LoginPage(driver);
//        homePage = new HomePage(driver);
//        loginPage.login("standard_user", "secret_sauce");
//        Assert.assertEquals("https://www.saucedemo.com/inventory.html", loginPage.verifyLogin());
//        Assert.assertTrue(homePage.verifyMenuButton());
//    }
//
//    @Test
//    public void test2_SuccessfulLogout() {
//        loginPage = new LoginPage(driver);
//        homePage = new HomePage(driver);
//        loginPage.login("standard_user", "secret_sauce");
//        homePage.logout();
//        Assert.assertEquals("https://www.saucedemo.com/" , homePage.verifyLogout());
//        Assert.assertTrue(loginPage.loginButtonIsDisplayed());
//    }

    @Test
    @Given("a user is on the {string} page")
    public void aUserIsOnThePage(String page) {
        driver.get(page);
    }

    @Test
    @And("the user enter a valid username {string}")
    public void theUserEnterAValidUsername(String username) {
        loginPage.setUsername(username);
    }

    @Test
    @And("the user enter a valid password {string}")
    public void theUserEnterAValidPassword(String password) {
        loginPage.setPassword(password);
    }

    @Test
    @When("the user clicks {string} button")
    public void theUserClicksButton(String button) {
        switch (button) {
            case "Login":
                loginPage.clickLoginButton();
                break;
            case "Add to cart":
                homePage.clickAddToCartSauceLabsOnesieButton();
                break;
            default:
                throw new IllegalArgumentException("There is no such button: " + button);

        }

    }

    @Test
    @Then("the user is redirected to the Home page")
    public void theUserIsRedirectedToTheHomePage() {
        Assert.assertEquals("https://www.saucedemo.com/inventory.html" , driver.getCurrentUrl());
        Assert.assertTrue(homePage.verifyMenuButton());
    }

    @Given("a user is on the Home page")
    public void aUserIsOnTheHomePage() {
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals("https://www.saucedemo.com/inventory.html" , driver.getCurrentUrl());
        Assert.assertTrue(homePage.verifyMenuButton());
    }

    @And("the user clicks menu button")
    public void theUserClicksMenuButton() {
        homePage.clickMenuButton();
    }

    @And("there is logout option")
    public void thereIsLogoutOption() {
        homePage.verifyLogoutButtonIsDisplayed();
    }

    @When("the user clicks logout option")
    public void theUserClicksLogoutOption() {
        homePage.clickLogout();
    }

    @Then("the user is logged out")
    public void theUserIsLoggedOut() {
        Assert.assertEquals("https://www.saucedemo.com/" , driver.getCurrentUrl());
        Assert.assertTrue(loginPage.loginButtonIsDisplayed());
    }
}
