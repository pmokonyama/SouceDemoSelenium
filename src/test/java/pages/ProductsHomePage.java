package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.time.Duration;

public class ProductsHomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement productText;
    @FindBy(xpath = "(//button[@class='btn btn_primary btn_small btn_inventory '])[2]")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//a[@class='shopping_cart_link'][contains(.,'1')]")
    WebElement cartLink_xpath;

    public ProductsHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void verifyProductTitleIsVisible() {
        System.out.println(productText.getText());
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(productText));

        // The below does exactly the same thing, you need to use one
        productText.isDisplayed();

        String productTExt = productText.getText();
        Assert.assertEquals(productTExt, "Products");
    }

    public void clickingOnCartButtonForSauceBike(){
        addToCartBtn.click();
    }


}
