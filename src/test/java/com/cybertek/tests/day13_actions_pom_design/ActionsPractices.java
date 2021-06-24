package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.tests.utilities.BrowserUtil;
import com.cybertek.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {
    @Test
    public void p2_double_click(){

        //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2. Switch to iframe.
        // We are switching to iframe using id attribute value and switchTo method.
        Driver.getDriver().switchTo().frame("iframeResult");


        //Locating the text to double click
        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));

        //3. Double click on the text “Double-click me to change my text color.”
        Actions actions = new Actions(Driver.getDriver());

        //use the 'actions' object to double click to already located web element
        BrowserUtil.sleep(2);
        actions.doubleClick(textToDoubleClick);
        actions.perform();

        //4. Assert: Text’s “style” attribute value contains “red”.
        String expectedText = "red";
        String actualText = textToDoubleClick.getAttribute("style");

        Assert.assertTrue(actualText.contains(expectedText));
    }

}
