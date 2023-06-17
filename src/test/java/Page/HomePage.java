package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className="bm-burger-button") WebElement menuButton;
    @FindBy(id="logout_sidebar_link") WebElement logout;

    public boolean verifyMenuButton() {
        return menuButton.isDisplayed();
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public boolean verifyLogoutButtonIsDisplayed() {
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

    public String verifyLogout() {
        return driver.getCurrentUrl();
    }
}
