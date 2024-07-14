package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePageObject {
    private By nestedFramesLinkLocator = By.linkText("Nested Frames");
    private By iframeLinkLocator = By.linkText("iFrame");

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public NestedFramesPage clickNestedFramesLink() {
        clickElement(nestedFramesLinkLocator);
        return new NestedFramesPage(driver);
    }
}
