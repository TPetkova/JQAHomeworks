package Test;

import Page.HomePage;
import Page.LoginPage;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void test1_SuccessfulLogin() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", loginPage.verifyLogin());
        Assert.assertTrue(homePage.verifyMenuButton());
    }

    @Test
    public void test2_SuccessfulLogout() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        loginPage.login("standard_user", "secret_sauce");
        homePage.logout();
        Assert.assertEquals("https://www.saucedemo.com/" , homePage.verifyLogout());
        Assert.assertTrue(loginPage.loginButtonIsDisplayed());
    }
}
