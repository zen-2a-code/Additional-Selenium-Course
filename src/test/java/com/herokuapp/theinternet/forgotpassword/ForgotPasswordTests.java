package com.herokuapp.theinternet.forgotpassword;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.ForgotPasswordPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class ForgotPasswordTests extends BaseTest {

    @Test
    public void testValidEmail(Method method) {
        ForgotPasswordPage forgotPasswordPage = welcomePage.clickForgotPasswordLink();
        forgotPasswordPage.retrievePassword("stoioxristov@gmail.com");

        // Asserting
        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = forgotPasswordPage.getMessageText();
        Assert.assertTrue(actualMessage.contains(expectedMessage), "The expected message is different.");
    }
}
