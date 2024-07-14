package com.herokuapp.theinternet.hover;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.HoversPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = welcomePage.clickHoversLink();

        // Hover over user one
        HoversPage.AvatarCaption avatarCaption = hoversPage.hoverOverAvatar(1);

        // Assertion
        Assert.assertTrue(avatarCaption.isCaptionDisplayed(), "Caption is not displayed");

        String expectedAvatarTitle = "name: user1";
        Assert.assertEquals(avatarCaption.getTitleText(), expectedAvatarTitle);

        String expectedLinkText = "View profile";
        Assert.assertEquals(avatarCaption.getLinkText(), expectedLinkText);

        Assert.assertTrue(avatarCaption.getLink().endsWith("/users/1"), "When to incorrect link");


    }
}
