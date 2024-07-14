package com.herokuapp.theinternet.horizontalscroll;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.HorizontalSliderPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HorizontalScrollTests extends BaseTest {

    @Test
    @Parameters({"value"})
    public void testMoveToRight(@Optional("4") String value) {
        int valueint = Integer.parseInt(value);

        welcomePage.open();
        HorizontalSliderPage horizontalSliderPage = welcomePage.clickHorizontalSliderLink();
        horizontalSliderPage.setSlider(valueint);

        //Assertion
        int actualValue = Integer.parseInt(horizontalSliderPage.getSliderValue());
        int expectedValue = valueint;

        Assert.assertEquals(actualValue, expectedValue, "Both values don't match");
    }
}
