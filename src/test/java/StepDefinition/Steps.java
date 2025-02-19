package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;
import pages.ProductsHomePage;
import utilities.BrowserDriver;

import static utilities.BrowserDriver.driver;

public class Steps {
    BrowserDriver browser = new BrowserDriver();
    public LoginPage login = new LoginPage(driver);
    ProductsHomePage homePage = new ProductsHomePage(driver);


    @Given("User is on the Saucedemo login page")
    public void user_is_on_the_Saucedemo_login_page() {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //String logoText = driver.findElement(By.className("login_logo")).getText();
        Assert.assertEquals("Swag Labs", login.getSwagLabsText());
    }


    @When("User logins with correct {string} and {string}")
    public void userLoginsWithCorrectAnd(String username, String password) {
        login.setUserName(username);
        login.setPassword(password);
        login.clickLoginBtn();
    }


    @Then("User should be logged in")
    public void user_should_be_logged_in() {
    }

    @Given("User is on the Products page")
    public void userIsOnTheProductsPage() {
        homePage.verifyProductTitleIsVisible();
    }

    @When("User selects second item on the product list")
    public void userSelectsSecondItemOnTheProductList() {
        homePage.clickingOnCartButtonForSauceBike();
    }

    @And("The cart icon should show item")
    public void theCartIconShouldShowItem() {
        homePage.clickCart();
    }

    @And("Verify, user is on the correct page Your Cart")
    public void VerifyUserIsOnTheCorrectPageYourCart() {
        homePage.verifyYourCartTitleIsVisible();
    }
    @And("Verify user selected the correct product")
    public void verifyUserSelectedTheCorrectProduct() {
        homePage.verifySelectedProduct();
    }
    @Then("User clicks the continue shopping button")
    public void userClicksTheContinueShoppingButton() {
        homePage.clickContinueShoppingButton();
    }
}

