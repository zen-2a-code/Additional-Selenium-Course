package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {
    private By usernameFiledLocator = By.id("username");
    private By passwordFiledLocator = By.id("password");
    private By loginBtnLocator = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public SecureAreaPage logIn(String username, String password) {
        type(usernameFiledLocator, username);
        type(passwordFiledLocator, password);
        clickElement(loginBtnLocator);
        return new SecureAreaPage(driver);
    }

}
