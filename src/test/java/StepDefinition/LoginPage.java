package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.BrowserDriver;

import static utilities.BrowserDriver.driver;

public class LoginPage {
    BrowserDriver browser = new BrowserDriver();


    @Given("User is on the Saucedemo login page")
    public void user_is_on_the_Saucedemo_login_page() {
        driver.get("https://www.saucedemo.com/");

        String logoText = driver.findElement(By.className("login_logo")).getText();
        Assert.assertEquals(logoText, "Swag Labs", "Page verification failed: Expected 'Swag Labs'");
    }


    @And("I enter username (.*)$")
    public void i_enter_username_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("I enter password (.*)$")
    public void i_enter_password_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.name("login-button")).click();
    }

    @Then("The home page is displayed")
    public void the_home_page_is_displayed() {
        driver.findElement(By.xpath("//span[@class='title'][contains(.,'Products')]")).isDisplayed();
    }

}
