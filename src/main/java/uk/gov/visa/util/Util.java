package uk.gov.visa.util;
/*
 * Created By Trupti Patel on 2019-08-18
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import uk.gov.visa.basepage.BasePage;


public class Util extends BasePage {
    public void clickonElement(By by) {
        driver.findElement(by).click();
    }


    /*
     This mehtod is for select visible text from drop down menu
      */
    public void selectVisibleTextFromDropDownMenu(By by, String text) {
        Select dropDown = new Select((driver.findElement(by)));
        dropDown.selectByVisibleText(text);
    }

    /*
    this method is for select by value from drop down Menu
     */
    public void selectByValueFromDropDownMenu(By by, String value) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByValue(value);
    }

    /*
    This method is for select by Index from drop down Menu
     */
    public void selectByIndexFromDropDownMenu(By by, int index) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByIndex(index);
    }
    /*
    this method is for select by value from drop down Menu
     */

    //Reture type method  to get text
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }

    }


}
