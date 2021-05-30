package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownPractices {
    WebDriver driver;

     @BeforeClass
    public void setupClass() {
         /**
          * Open Chrome browser
          * 2. Go to http://practice.cybertekschool.com/dropdown
          */
          driver =  WebDriverFactory.getDriver("chrome");
         // driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         driver.get("http://practice.cybertekschool.com/dropdown");

    }

    /**
     * Verify “Simple dropdown” default selected value is correct
     * Expected: “Please select an option”
     * 4. Verify “State selection” default selected value is correct
     * Expected: “Select a State”
     */

    @Test
    public void tc1_simple_dropdown_test() {

        //3. Verify “Simple dropdown” default selected value is correct
        //      Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();
        String actualTextOfCurrentOption = currentlySelectedOption.getText();
        String expectedTextOfCurrentOption = "Please select an option";

        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedTextOfCurrentOption));

        //4. Verify “State selection” default selected value is correct
        //      Expected: “Select a State”
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropdownText = "Select a State";

        Assert.assertTrue(actualStateDropdownText.equals(expectedStateDropdownText));
    }

    @Test
    public void tc2_state_dropdown_test() throws InterruptedException {
Thread.sleep(5000);
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByVisibleText("Illinois");
        stateDropdown.selectByValue("VA");
        stateDropdown.selectByIndex(5);

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText, " Title is not expected ");

    }


}
