package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage extends BasePageObject {
    private By topFramesContainerLocator = By.cssSelector("[name=frame-top]");
    private By topLeftFrameLocator = By.cssSelector("[name=frame-left]");
    private By bottomFrameLocator = By.cssSelector("[name=frame-bottom]");
    private By bodyLocator = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    private void switchToiFrame(By locator) {
        driver.switchTo().frame(findElement(locator));
    }

    private void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    private void switchToTopFrames() {
        driver.switchTo().frame(0);
    }

    private void switchToBottomFrame() {
        driver.switchTo().frame(1);
    }

    public String getTextFromUpperLeftFrame() {
        switchToTopFrames();
        switchToiFrame(topLeftFrameLocator);
        String textInFrame = findElement(bodyLocator).getText();
        switchToDefaultContent();
        return textInFrame;
    }

    public String getTextFromBottomFrame() {
        switchToBottomFrame();
        String textInFrame = findElement(bodyLocator).getText();
        switchToDefaultContent();
        return textInFrame;
    }
}

