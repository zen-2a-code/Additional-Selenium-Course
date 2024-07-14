package com.herokuapp.theinternet.nestedframes;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.FramesPage;
import com.herokuapp.theinternet.pages.NestedFramesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NestedFramesTests extends BaseTest {

    @Test
    public void testLeftAndBottomFrameTest() {
        welcomePage.open();
        FramesPage framesPage = welcomePage.clickFramesLink();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();

        String actualTextUpperLeftFrame = nestedFramesPage.getTextFromUpperLeftFrame();
        String actualTextBottomFrame = nestedFramesPage.getTextFromBottomFrame();

        // Assertion
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(actualTextUpperLeftFrame.contains("LEFT"),
                String.format("Expected text: LEFT \nActual text: %s\n", actualTextUpperLeftFrame));
        softAssert.assertTrue(actualTextBottomFrame.contains("BOTTOM"),
                String.format("Expected text: BOTTOM \nActual text: %s\n", actualTextBottomFrame));

        softAssert.assertAll();
    }
}
