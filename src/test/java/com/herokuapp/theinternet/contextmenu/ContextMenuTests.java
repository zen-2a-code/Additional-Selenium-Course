package com.herokuapp.theinternet.contextmenu;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.ContextMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTest {

    @Test
    public void testContextMenuRightClick() {
        welcomePage.open();
        ContextMenuPage contextMenuPage = welcomePage.clickContextMenuLink();
        contextMenuPage.sendRightClickToHotspotBox();

        String actualTextAlert = contextMenuPage.alert_getText();
        String expectedTextAlert = "You selected a context menu";
        contextMenuPage.alert_confirm();

        Assert.assertEquals(actualTextAlert, expectedTextAlert);
    }
}
