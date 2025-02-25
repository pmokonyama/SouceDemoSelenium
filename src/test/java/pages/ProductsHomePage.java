package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import java.time.Duration;



public class ProductsHomePage {

    static WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement productText;

    @FindBy(xpath = "(//button[@class='btn btn_primary btn_small btn_inventory '])[2]/following-sibling::*")
    WebElement addToCartBtn;

    @FindBy(xpath = "//a[@class='shopping_cart_link'][contains(.,'1')]")
    WebElement click_cart;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement yourCartText;

    @FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div")
    WebElement product_name;

    @FindBy(xpath = "//*[@id=\"continue-shopping\"]")
    WebElement continue_shopping_button;



    public ProductsHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);


    }

    public void verifyProductTitleIsVisible() {
        System.out.println(productText.getText());
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productText));


        productText.isDisplayed();

        String productTExt = productText.getText();
        Assert.assertEquals(productTExt, "Products");
    }

    public void clickingOnCartButtonForSauceBike(){
        addToCartBtn.click();
    }

    public void clickCart() {
        new WebDriverWait(driver, Duration.ofSeconds(5000))
                .until(ExpectedConditions.elementToBeClickable(click_cart))
                .click();
    }


    public void verifyYourCartTitleIsVisible() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(yourCartText));
        Assert.assertEquals("Your Cart", yourCartText.getText());
    }
    // Verifies the selected product name
    public void verifySelectedProduct() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(product_name));
        Assert.assertEquals("Sauce Labs Bike Light", product_name.getText());

 }

    public void clickContinueShoppingButton() {
        continue_shopping_button.click();
    }

}

