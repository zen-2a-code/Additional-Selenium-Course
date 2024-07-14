package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownPage extends BasePageObject {
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectFromDropdown(String option) {
        selectDropdownOptionByVisibleText(dropdown, option);
    }

    public List<String> getSelectedOptions() {
        return getSelectedDropdownOptions(dropdown);
    }

    public void makeDropdownMultiselect() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "arguments[0].setAttribute('multiple', '')";
        WebElement dropdownMenuEl = findElement(dropdown);
        js.executeScript(script, dropdownMenuEl);

    }
}
