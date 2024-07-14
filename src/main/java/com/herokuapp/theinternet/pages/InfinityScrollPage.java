package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfinityScrollPage extends BasePageObject {
    private By paragraphsLocator = By.className("jscroll-added");

    public InfinityScrollPage(WebDriver driver) {
        super(driver);
    }

    /**
     * @param paragraphNumber int Index is 1 based
     */
    public void scrollToParagraph(int paragraphNumber) {

        while (getCurrentParagraphCount() < paragraphNumber) {
            scrollToBottomOfPage();
        }
    }

    private void scrollToBottomOfPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        js.executeScript(script);
    }

    public int getCurrentParagraphCount() {
        return findElements(paragraphsLocator).size();
    }

}
