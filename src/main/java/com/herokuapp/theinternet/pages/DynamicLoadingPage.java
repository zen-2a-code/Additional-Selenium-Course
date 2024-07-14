package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends BasePageObject {
    private By elementOnPageThatIsHiddenLinkLocator = By.xpath("//a[contains(text(), 'Example 1')]");
    private By elementRenderedAfterLinkLocator = By.xpath("//a[contains(text(), 'Example 2')]");

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public DynamicExample1Page clickExample1() {
        clickElement(elementOnPageThatIsHiddenLinkLocator);
        return new DynamicExample1Page(driver);
    }

    public DynamicExample2Page clickExample2() {
        clickElement(elementRenderedAfterLinkLocator);
        return new DynamicExample2Page(driver);
    }

}
