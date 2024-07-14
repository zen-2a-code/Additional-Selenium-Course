package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;


public class BasePageObject {
    protected WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;

    }

    protected WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    protected List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    protected void clickElement(By locator) {
        findElement(locator).click();
    }

    protected void openPage(String link) {
        driver.get(link);
    }

    protected int countListElements(By listLocator) {
        WebElement el = findElement(listLocator);
        return el.findElements(By.tagName("li")).size();
    }

    protected void type(By locator, String text) {
        findElement(locator).sendKeys(text);
    }

    /**
     * Selects a dropdown option based on a visible text.
     *
     * @param locator By this locator is used to locate the dropdown menu on the page
     * @param option  String the option to select.
     */
    protected void selectDropdownOptionByVisibleText(By locator, String option) {
        findDropdown(locator).selectByVisibleText(option);
    }

    /**
     * @param locator This is By it is used to locate the dropdown element.
     * @return String The visible option which is selected.
     */
    protected String getSelectedDropdownOption(By locator) {
        return findDropdown(locator).getFirstSelectedOption().getText();
    }

    /**
     * Retrieves the text of all selected options from a dropdown menu identified by the given locator.
     *
     * @param locator the By locator used to identify the dropdown element
     * @return a list of strings representing the text of all selected options in the dropdown
     */
    protected List<String> getSelectedDropdownOptions(By locator) {

        // Find the dropdown element using the specified locator and get all selected options
        List<WebElement> elements = findDropdown(locator).getAllSelectedOptions();

        // Create a list of strings by mapping each WebElement to its text representation
        List<String> options = elements.stream()
                .map(element -> element.getText()) // Extract the text from each WebElement
                .collect(Collectors.toList()); // Collect the text into a list of strings

        // Return the list of selected option texts
        return options;
    }

    /**
     * This method is private and it to be used only in the BasePageObject. It takes a locator of a dropdown menu and
     * returns a Select obj of the dropdown menu which provides more control of a dropdown menu.
     */
    private Select findDropdown(By locator) {
        WebElement element = findElement(locator);
        return new Select(element);
    }

    public void alert_confirm() {
        driver.switchTo().alert().accept();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_sendText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public void alert_dismiss() {
        driver.switchTo().alert().dismiss();
    }


}
