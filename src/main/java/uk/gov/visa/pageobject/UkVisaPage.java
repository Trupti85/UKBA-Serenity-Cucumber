package uk.gov.visa.pageobject;
/*
 * Created By Trupti Patel
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.gov.visa.util.Util;

public class UkVisaPage extends Util {
    By startNowBtn = By.xpath("//*[@id=\"get-started\"]/a");
    By country = By.xpath("//select[@id='response']");
    By nextStepBtn = By.xpath("//*[@id=\"current-question\"]/div[2]/button");
    By study = By.xpath("//*[@id=\"current-question\"]/div[1]/div/div/ul/li[3]/label");
    By tourism = By.xpath("//*[@id=\"current-question\"]/div[1]/div/div/ul/li[1]/label");
    By nextBtn = By.xpath("//*[@id=\"current-question\"]/div[2]/button");
    By moreMonth = By.xpath(("//*[@id=\"current-question\"]/div[1]/div/div/ul/li[2]/label"));
    By stepNextBtn = By.xpath("//*[@id=\"current-question\"]/div[2]/button");
    By getTextStudy = By.xpath("//*[@id=\"content\"]/div[1]/article/div/div/div/h2");
    By getTextTourism = By.xpath("//*[@id=\"content\"]/div[1]/article/div/div/div[1]/h2");
    By getTextJapanTourism = By.xpath("//*[@id=\"content\"]/div[1]/article/div/div/div[1]/h2");
    By no = By.xpath("//*[@id=\"current-question\"]/div[1]/div/div/ul/li[2]/label");

    public void clickOnStatNow() {
        clickonElement(startNowBtn);
    }

    public void selectcountry(String count) {
        clickonElement(country);
        selectVisibleTextFromDropDownMenu(country, count);

    }

    public void clickOnNextStepBtn() {
        clickonElement(nextStepBtn);
    }

    public void selectReasonStudy() {
        clickonElement(study);
    }

    public void selectReasonTourism() {
        clickonElement(tourism);
    }

    public void clickOnNextBtn() {
        clickonElement(nextBtn);
    }

    public void selectMoreMonth() {
        clickonElement(moreMonth);
    }

    public void clickOnStepNextBtn() {
        clickonElement(stepNextBtn);
    }

    public String getRequireVisaTextStudy() {
        return getTextFromElement(getTextStudy);
    }

    public String getRequireVisaTextTourism() {

        return getTextFromElement(getTextTourism);
    }

    public String getRequiredVisaTextJapanTourism() {
        return getTextFromElement(getTextJapanTourism);
    }


    public boolean verifyStudyVisaText() {
        if (getRequireVisaTextStudy().equals("You’ll need a visa to study in the UK")) {
            return true;

        } else {
            return false;
        }
    }

    public boolean verifyTourismVisaText() {
        if (getRequireVisaTextTourism().equals("You’ll need a visa to come to the UK")) {
            return true;
        } else {
            return false;
        }
    }

    public void selectNo() {
        clickonElement(no);
    }

    public boolean verifyJapanTourismText() {
        if (getRequiredVisaTextJapanTourism().equals("You won’t need a visa to come to the UK")) {
            return true;
        } else {
            return false;
        }
    }


}







