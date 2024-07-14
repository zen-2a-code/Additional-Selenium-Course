package com.herokuapp.theinternet.shiftingContent.menuelement;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.ShiftingContentMenuPage;
import com.herokuapp.theinternet.pages.ShiftingContentPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountListElementsTest extends BaseTest {

    @Test
    public void countListElementsTest() {
        WelcomePage wp = new WelcomePage(driver);
        wp.open();
        ShiftingContentPage shiftingContentPage = wp.clickShiftingContentLink();
        ShiftingContentMenuPage shiftingContentMenuPage = shiftingContentPage.clickMenuElementLink();

        int elementsCount = shiftingContentMenuPage.countListEntries();

        Assert.assertEquals(elementsCount, 5, "List elements were not 5 as expected Actual elements: " + elementsCount + " expected 5");
    }
}
