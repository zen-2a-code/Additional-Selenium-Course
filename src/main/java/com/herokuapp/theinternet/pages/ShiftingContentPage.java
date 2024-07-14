package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage extends BasePageObject {
    private By menuElementLocator = By.linkText("Example 1: Menu Element");
    private By anImageLinkLocator = By.linkText("Example 2: An image");
    private By listElementLocator = By.linkText("Example 3: List");

    public ShiftingContentPage(WebDriver driver) {
        super(driver);
    }

    public ShiftingContentMenuPage clickMenuElementLink() {
        clickElement(menuElementLocator);
        return new ShiftingContentMenuPage(driver);
    }


}
