package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.servlet.annotation.WebListener;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className="bm-burger-button") WebElement menuButton;
    @FindBy(id="logout_sidebar_link") WebElement logout;
    @FindBy(id="item_2_title_link") WebElement SauceLabsOnesie;
    @FindBy(id="add-to-cart-sauce-labs-onesie") WebElement addToCartSauceLabsOnesieButton;
    @FindBy(className = "shopping_cart_link") WebElement shoppingCartHome;
    @FindBy(className = "shopping_cart_badge") WebElement quantityOfProductsInCart;
    @FindBy(id="add-to-cart-sauce-labs-backpack") WebElement addToCartSauceLabsBackpack;

    public boolean verifyMenuButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("bm-burger-button")));
        return menuButton.isDisplayed();
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public boolean verifyLogoutButtonIsDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link")));
        return logout.isDisplayed();
    }

    public void clickLogout() {
        logout.click();
    }

    public void logout() {
        clickMenuButton();
        verifyLogoutButtonIsDisplayed();
        clickLogout();
    }

    public void clickSauceLabsOnesie() {
        SauceLabsOnesie.click();
    }

    public void clickAddToCartSauceLabsOnesieButton() {
            addToCartSauceLabsOnesieButton.click();
    }

    public String getQuantity() {
        return quantityOfProductsInCart.getText();
    }

    public void clickShoppingCartHomeImage() {
        shoppingCartHome.click();
    }

    public void clickAddToCartSauceLabsBackpackButton() {
        addToCartSauceLabsBackpack.click();
    }


}
