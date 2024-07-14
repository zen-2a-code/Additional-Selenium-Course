package com.herokuapp.theinternet.login;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = welcomePage.clickFormAuthenticationLink();
        SecureAreaPage secureAreaPage = loginPage.logIn("tomsmith", "SuperSecretPassword!");
        String actualText = secureAreaPage.getAlertText();

        // Assertion
        String expectedMessage = "You logged into a secure area!";
        Assert.assertTrue(actualText.contains(expectedMessage), "The actual text is: " +
                actualText + " should be " + expectedMessage);

    }
}
