package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public ChromeOptions options;

    public BrowserDriver(){
        this.driver= driver;
        String driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        this.options = new ChromeOptions();
        this.driver = new ChromeDriver(options);



    }
    public void close(){
        this.driver.close();
    }
}
