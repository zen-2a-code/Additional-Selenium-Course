package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressesPage extends BasePageObject {
    private By inputFieldLocator = By.id("target");
    private By resultLocator = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public void typeText(String text) {
        type(inputFieldLocator, text);
    }

    public void typeBackspace() {
        findElement(inputFieldLocator).sendKeys(Keys.BACK_SPACE);
    }

    public void typePi() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[0].value + '\u03C0 = 3.141592';", findElement(inputFieldLocator));
    }

    public String getResultText() {
        return findElement(resultLocator).getText();
    }

    public String getInputFieldText() {
        return findElement(inputFieldLocator).getAttribute("value");
    }
}
