package com.herokuapp.theinternet.base;

import com.herokuapp.theinternet.pages.WelcomePage;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    protected WebDriver driver;
    protected WelcomePage welcomePage;

    @BeforeClass
    public void setUp() {
        System.out.println("Creating driver");
        this.driver = new ChromeDriver();
        this.driver.manage().window().setPosition(new Point(-1000, 200));
        this.driver.manage().window().maximize();

        this.welcomePage = new WelcomePage(driver);

    }

    @AfterClass
    public void tearDown() {
        System.out.println("Closing driver");
        this.driver.quit();
    }

}
