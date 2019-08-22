package uk.gov.visa.cucumber;
/*
 * Created By Trupti Patel on 2019-08-18
 */

import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.gov.visa.basepage.BasePage;
import uk.gov.visa.browserselector.BrowserSelector;
import uk.gov.visa.properties.LoadProperties;

import java.util.concurrent.TimeUnit;

public class Hooks  extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperties loadProperties = new LoadProperties();

    String browser = loadProperties.getProperty(("browser"));
    String baseUrl =  loadProperties.getProperty("baseUrl");
    @Before
    public void setUp(){
        browserSelector.selectBrowser(browser);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(){
        driver.quit();
    }


}
