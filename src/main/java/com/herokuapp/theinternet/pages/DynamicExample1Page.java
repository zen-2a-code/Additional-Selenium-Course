package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicExample1Page extends BasePageObject {
    private By startBtnLocator = By.cssSelector("#start button");
    private By result = By.id("finish");
    private By loading = By.cssSelector("#loading");

    public DynamicExample1Page(WebDriver driver) {
        super(driver);
    }

    public void clickStart() {
        clickElement(startBtnLocator);
    }

    public String getResult() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loading));
        return findElement(result).getText();

    }
}
