package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePageObject {
    private By hotspotLocator = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void sendRightClickToHotspotBox() {
        Actions actions = new Actions(driver);
        actions.contextClick(findElement(hotspotLocator)).perform();
    }

}
