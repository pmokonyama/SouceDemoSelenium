package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;
import utilities.BrowserDriver;

import static utilities.BrowserDriver.driver;

public class Login {
    BrowserDriver browser = new BrowserDriver();
    public LoginPage login = new LoginPage(driver);


    @Given("User is on the Saucedemo login page")
    public void user_is_on_the_Saucedemo_login_page() {
        driver.get("https://www.saucedemo.com/");

        String logoText = driver.findElement(By.className("login_logo")).getText();
        Assert.assertEquals(logoText, "Swag Labs");
    }

    @When("User logins with correct username and password")
    public void userLoginsWithCorrectUsernameAndPassword() {
        login.setUserName("standard_user");
        login.setPassword("secret_sauce");
        login.clickLoginBtn();

    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        Assert.assertEquals("Products", login.getPageTitleAfterLogin());
    }
}
