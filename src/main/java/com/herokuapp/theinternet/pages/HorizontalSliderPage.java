package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HorizontalSliderPage extends BasePageObject {
    private By sliderLocator = By.cssSelector(".sliderContainer input");
    private By resultLocator = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    public void setSlider(int value) {
        double currentResultValue = Double.parseDouble(getSliderValue()); // Parsing String to Double
        double differance = value - currentResultValue; // value - currentResultValue will yield a positive result if
        // value is greater than currentResultValue, indicating that the slider needs to move to the right.
        int actionCount = (int) Math.round(differance * 2); // As the step is 0.5 per key press.

        if (actionCount > 0) {
            for (int i = 1; i <= actionCount; i++) {
                moveSlider(Keys.RIGHT);
            }
        } else if (actionCount < 0) {
            for (int i = 1; i <= Math.abs(actionCount); i++) {
                moveSlider(Keys.LEFT);
            }
        }
    }

    public String getSliderValue() {
        return findElement(resultLocator).getText();
    }

    private void moveSlider(Keys key) {
        findElement(sliderLocator).sendKeys(key);
    }
}
