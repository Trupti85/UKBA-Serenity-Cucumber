package uk.gov.visa.cucumber.steps;
/*
 * Created By Trupti Patel
 */

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.gov.visa.pageobject.UkVisaPage;

public class MyStepdefs {
    @Given("^I am at home page$")
    public void iAmAtHomePage() {
    }

    @When("^I click on start button$")
    public void iClickOnStartButton() {

        new UkVisaPage().clickOnStatNow();
    }

    @And("^I navigate to check Visa$")
    public void iNavigateToCheckVisa() {
    }

    @And("^I provide a nationality of \"([^\"]*)\"$")
    public void iProvideANationalityOf(String country) {

        new UkVisaPage().selectcountry(country);
    }

    @And("^I click Next$")
    public void iClickNext() {
        new UkVisaPage().clickOnNextStepBtn();

    }

    @And("^I select the reason Study$")
    public void iSelectTheReasonStudy() {
        new UkVisaPage().selectReasonStudy();

    }

    @And("^I state I am intending to stay for more than six months$")
    public void iStateIAmIntendingToStayForMoreThanSixMonths() {
        new UkVisaPage().selectMoreMonth();
    }

    @And("^I click Next step$")
    public void iClickNextStep() {
        new UkVisaPage().clickOnNextBtn();
    }


    @And("^I submit the form$")
    public void iSubmitTheForm() {
        new UkVisaPage().clickOnStepNextBtn();
    }


    @And("^I select the reason Tourism$")
    public void iSelectTheReasonTourism() {
        new UkVisaPage().selectReasonTourism();

    }

    @And("^I state I am travelling or staying with partner or family$")
    public void iStateIAmTravellingOrStayingWithPartnerOrFamily() {
        new UkVisaPage().selectNo();
    }

    @Then("^I will be informed I need a visa to study in the UK$")
    public void iWillBeInformedINeedAVisaToStudyInTheUK() {
        Assert.assertTrue(new UkVisaPage().verifyStudyVisaText());

    }


    @Then("^I will be informed I won’t need a visa to come to the UK$")
    public void iWillBeInformedIWonTNeedAVisaToComeToTheUK() {
        Assert.assertTrue((new UkVisaPage().verifyJapanTourismText()));
    }

    @Then("^I will be informed I You’ll need a visa to come to the UK$")
    public void iWillBeInformedIYouLlNeedAVisaToComeToTheUK() {
        Assert.assertTrue(new UkVisaPage().verifyTourismVisaText());
    }


}
