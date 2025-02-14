package StepDefinition;

import io.cucumber.java.en.Given;
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

}
