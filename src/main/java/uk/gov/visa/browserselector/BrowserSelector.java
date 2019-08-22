package uk.gov.visa.browserselector;
/*
 * Created By Trupti Patel
 */


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.gov.visa.basepage.BasePage;

public class BrowserSelector extends BasePage {
    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver"
                    , System.getProperty("user.dir") + "/src/test/java/resources/driver/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver"
                    , System.getProperty("user.dir") + "/src/test/java/resources/driver/geckodriver");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser Selected");
        }
    }
}
