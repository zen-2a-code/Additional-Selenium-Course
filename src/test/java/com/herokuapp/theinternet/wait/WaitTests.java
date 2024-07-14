package com.herokuapp.theinternet.wait;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.DynamicExample1Page;
import com.herokuapp.theinternet.pages.DynamicExample2Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilVisible() {
        welcomePage.open();
        DynamicExample2Page dynamicExample2Page = welcomePage.clickDynamicLoadingLink().clickExample2();
        dynamicExample2Page.clickStart();

        String actualValue = dynamicExample2Page.getResult();
        String expectedValue = "Hello World!";

        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testWaitUtilHidden(){
        welcomePage.open();
        DynamicExample1Page dynamicExample1Page = welcomePage.clickDynamicLoadingLink().clickExample1();
        dynamicExample1Page.clickStart();

        String actualValue = dynamicExample1Page.getResult();
        String expectedValue = "Hello World!";

        Assert.assertEquals(actualValue, expectedValue);
    }
}
