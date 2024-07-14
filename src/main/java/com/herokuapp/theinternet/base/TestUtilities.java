package com.herokuapp.theinternet.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;

public class TestUtilities extends BaseTest{


    /**
     * Take a screenshot and save it with the specified file name.
     *
     * @param fileName The name of the screenshot file.
     */
    public static void takeScreenshot(WebDriver driver, String testSuiteName, String testName, String testMethodName, String fileName) {
        // Capture the screenshot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Construct the path to save the screenshot
        String path = System.getProperty("user.dir")
                + File.separator + "test-output"
                + File.separator + "screenshots"
                + File.separator + getTodaysDate()
                + File.separator + testSuiteName
                + File.separator + testName
                + File.separator + testMethodName
                + File.separator + getSystemTime()
                + " " + fileName + ".png";

        // Save the screenshot to the constructed path
        try {
            FileUtils.copyFile(scrFile, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getTodaysDate() {
        return (new SimpleDateFormat("dd.MM.yyyy").format(new Date()));
    }

    private static String getSystemTime() {
        return (new SimpleDateFormat("HH.mm.ss.SSS").format(new Date()));
    }
}
