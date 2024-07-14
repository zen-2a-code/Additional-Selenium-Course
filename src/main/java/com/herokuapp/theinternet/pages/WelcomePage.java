package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {

    private By shiftingContentLinkLocator = By.linkText("Shifting Content");
    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
    private By dropdownLinkLocator = By.linkText("Dropdown");
    private By forgotPasswordLinkLocator = By.linkText("Forgot Password");
    private By hoversLinkLocator = By.linkText("Hovers");
    private By keyPressesLinkLocator = By.linkText("Key Presses");
    private By horizontalSliderLinkLocator = By.linkText("Horizontal Slider");
    private By contextMenuLinkLocator = By.linkText("Context Menu");
    private By framesLinkLocator = By.linkText("Frames");
    private By dynamicLoadingLinkLocator = By.linkText("Dynamic Loading");
    private By infiniteScrollLinkLocator = By.linkText("Infinite Scroll");

    private String pageUrl = "https://the-internet.herokuapp.com/";

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public ShiftingContentPage clickShiftingContentLink() {
        clickElement(this.shiftingContentLinkLocator);
        return new ShiftingContentPage(driver);
    }

    public LoginPage clickFormAuthenticationLink() {
        clickElement(this.formAuthenticationLinkLocator);
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownLink() {
        clickElement(this.dropdownLinkLocator);
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordLink() {
        clickElement(this.forgotPasswordLinkLocator);
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHoversLink() {
        clickElement(hoversLinkLocator);
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPressesLink() {
        clickElement(keyPressesLinkLocator);
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink() {
        clickElement(horizontalSliderLinkLocator);
        return new HorizontalSliderPage(driver);
    }

    public ContextMenuPage clickContextMenuLink() {
        clickElement(contextMenuLinkLocator);
        return new ContextMenuPage(driver);
    }

    public FramesPage clickFramesLink() {
        clickElement(framesLinkLocator);
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink(){
        clickElement(dynamicLoadingLinkLocator);
        return new DynamicLoadingPage(driver);
    }

    public InfinityScrollPage clickInfinityScrollLink(){
        clickElement(infiniteScrollLinkLocator);
        return new InfinityScrollPage(driver);
    }


    public void open() {
        openPage(this.pageUrl);
    }

}
