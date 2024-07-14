package com.herokuapp.theinternet.keys;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTests extends BaseTest {

    @Test(enabled = false)
    public void testBackspace() {
        welcomePage.open();
        KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();
        keyPressesPage.typeBackspace();

        // Assertion
        String expectedText = "You entered: BACK_SPACE";
        String actualText = keyPressesPage.getResultText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void testPi() {
        welcomePage.open();
        KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();
        keyPressesPage.typePi();
        System.out.println(keyPressesPage.getInputFieldText());

    }
}
