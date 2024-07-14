package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HoversPage extends BasePageObject {
    private By avatarsLocator = By.cssSelector("div.figure"); // Selecting by tag and then value of a class
    private By textBoxcaptionLocator = By.className("figcaption");


    public HoversPage(WebDriver driver) {
        super(driver);
    }

    /**
     * @param index starts at 1
     */
    public AvatarCaption hoverOverAvatar(int index) {
        Actions actions = new Actions(driver);
        WebElement avatar = findElements(avatarsLocator).get(index - 1);
        actions.moveToElement(avatar).perform();

        return new AvatarCaption(avatar.findElement(textBoxcaptionLocator));
    }

    public class AvatarCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");


        public AvatarCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        public String getTitleText() {
            return caption.findElement(header).getText();
        }

        public String getLinkText() {
            return caption.findElement(link).getText();
        }

        public String getLink() {
            return caption.findElement(link).getAttribute("href");
        }
    }
}
