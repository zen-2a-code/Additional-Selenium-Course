package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePageObject {

    private By statusAlertLocator = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }


    /**
     * This method provides a way to get the text of the alert regardless of whether the customer managed to enter the
     * secure page or not. It can be used even if the secure page was never reached, as the #flash id is also on the
     * login page and serves the same purpose.
     */

    public String getAlertText() {
        return findElement(statusAlertLocator).getText();
    }

}
