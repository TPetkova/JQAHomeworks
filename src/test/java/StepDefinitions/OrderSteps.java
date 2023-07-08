package StepDefinitions;

import Helpers.BaseTest;
import Page.HomePage;
import Page.LoginPage;
import Page.OrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class OrderSteps {
    private LoginPage loginPage;
    private HomePage homePage;
    private OrderPage orderPage;
    WebDriver driver;

    public OrderSteps() {
        this.driver = BaseTest.getDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        orderPage = new OrderPage(driver);
    }
    @And("the user selects an item {string} from the products")
    public void theUserSelectsAnItemFromTheProducts(String item) {
        BaseTest.scrollToBottomOfPage();
        homePage.clickSauceLabsOnesie();
    }

    @Then("the shopping cart has {int} product")
    public void theShoppingCartHasProduct(int quantity) {
        int actualQuantity = Integer.parseInt(homePage.getQuantity());
        Assert.assertEquals("The quantity of the product should be " + quantity, quantity, actualQuantity);
    }

    @And("the selected item {string} is added to the cart")
    public void theSelectedItemIsAddedToTheCart(String item) {
        homePage.clickShoppingCartHomeImage();
        Assert.assertEquals("Product name should be "+ item, item, orderPage.getOrderedProductName());
    }

    @When("the user clicks {string} button of the product {string}")
    public void theUserClicksButtonOfTheProduct(String button, String product) {
        if (button.equals("Add to cart") && product.equals("Sauce Labs Backpack")) {
            homePage.clickAddToCartSauceLabsBackpackButton();
        }
    }
}
