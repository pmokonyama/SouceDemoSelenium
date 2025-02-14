package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.BrowserDriver.driver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //These are my locators
    private By swagLabsLogo = By.className("login_logo");


    public String getSwagLabsText() {
        return driver.findElement(swagLabsLogo).getText();
    }


}

