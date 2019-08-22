package uk.gov.visa.cucumber;
/*
 * Created By Trupti Patel on 2019-08-18
 */

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import uk.gov.visa.basepage.BasePage;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "/Users/surajbharmal/IdeaProjects/gov-visa-uk/src/test/java/resources/feature")
//@CucumberOptions(
//        features = ".",
//        plugin = {"pretty","html:target/cucumber-reports"},
//        tags = "@Study,@Japan",
//        monochrome = true
//)

public class CucumberRunner extends BasePage {
}
