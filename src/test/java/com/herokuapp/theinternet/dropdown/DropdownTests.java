package com.herokuapp.theinternet.dropdown;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.DropdownPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectOption() {

        welcomePage.open();
        DropdownPage dropdownPage = welcomePage.clickDropdownLink();

        String optionToSelect = "Option 1";
        dropdownPage.selectFromDropdown(optionToSelect);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();

        Assert.assertEquals(selectedOptions.size(), 1,
                "We should have only 1 option selected we have " + selectedOptions.size());
        Assert.assertEquals(selectedOptions.get(0), optionToSelect, "The selected option incorrect");
    }

    @Test
    public void testMakedropdownMultiOptional() {
        welcomePage.open();
        DropdownPage dropdownPage = welcomePage.clickDropdownLink();
        dropdownPage.makeDropdownMultiselect();
        dropdownPage.selectFromDropdown("Option 1");
        dropdownPage.selectFromDropdown("Option 2");
        List<String> selectedOptions = dropdownPage.getSelectedOptions();

        Assert.assertTrue(selectedOptions.contains("Option 1"));
        Assert.assertTrue(selectedOptions.contains("Option 2"));
    }
}
