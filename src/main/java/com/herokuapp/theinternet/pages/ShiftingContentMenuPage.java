package com.herokuapp.theinternet.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentMenuPage extends BasePageObject {
    private By listLocator = By.tagName("ul");

    public ShiftingContentMenuPage(WebDriver driver) {
        super(driver);
    }

    public int countListEntries() {
        return countListElements(listLocator);
    }
}
