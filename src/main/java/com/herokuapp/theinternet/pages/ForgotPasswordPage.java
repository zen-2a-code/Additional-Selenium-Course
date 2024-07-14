package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Method;

public class ForgotPasswordPage extends BasePageObject {
    private By emailInputFieldLocator = By.id("email");
    private By retrievePasswordBtnLocator = By.id("form_submit");
    private By messageLocator = By.id("flash-messages");


    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void retrievePassword(String email) {
        type(emailInputFieldLocator, email);
        clickElement(retrievePasswordBtnLocator);
    }

    public String getMessageText() {
        return findElement(messageLocator).getText();
    }

}
