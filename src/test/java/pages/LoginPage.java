package pages;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    WebDriver driver;

    //These are my locators
    private By swagLabsLogo = By.className("login_logo");
    private By userName = By.xpath("//*[@id=\"user-name\"]");
    private By Password = By.xpath("//*[@id=\"password\"]");
    private By loginBtn = By.xpath("//*[@id=\"login-button\"]");
    private By products = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getSwagLabsText() {
        return driver.findElement(swagLabsLogo).getText();
    }

    public void setUserName(String username){
        driver.findElement(userName).sendKeys(username);

    };

    public void setPassword(String password){
        driver.findElement(Password).sendKeys(password);

    };

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();

    }

    public String getPageTitleAfterLogin() {
        return driver.findElement(products).getText();
    }

}

