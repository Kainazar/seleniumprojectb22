package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.pages.DynamicLoad7Page;
import com.cybertek.pages.Dynamic_Load_Page1;
import com.cybertek.tests.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {
    @Test
    public void dynamic_loading_7_test(){
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/7
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

        //use the object to wait for the explicit condition
        //wait.until(ExpectedConditions.titleIs("Dynamic title"));
        wait.until(ExpectedConditions.visibilityOf(dynamicLoad7Page.picture));


//        3. Assert : Message “Done” is displayed.
//        String expected = "Dynamic title";
//        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(dynamicLoad7Page.alert.isDisplayed());
//        4. Assert : Image is displayed.
        Assert.assertTrue(dynamicLoad7Page.picture.isDisplayed());

    }
    @Test
    public void dynamic_load_1(){
//        1. Go to http://practice.cybertekschool.com/dynamic_loading/1
//        2. Click to start
//        3. Wait until loading bar disappears
//        4. Assert username inputbox is displayed
//        5. Enter username: tomsmith
//        6. Enter password: incorrectpassword
//        7. Click to Submit button
//        8. Assert “Your password is invalid!” text is displayed.
//                Note: Follow POM Design Pattern
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        Dynamic_Load_Page1 dynamicLoadPage1 = new Dynamic_Load_Page1();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),7);
        dynamicLoadPage1.startBtn.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoadPage1.loadingBar));
        dynamicLoadPage1.username.sendKeys("incorrectpassword");
        Assert.assertTrue(dynamicLoadPage1.username.isDisplayed());
        dynamicLoadPage1.password.sendKeys("incorrectpassword");
        Assert.assertTrue(dynamicLoadPage1.password.isDisplayed());
        dynamicLoadPage1.submitBtn.click();
        dynamicLoadPage1.errorMessage.isDisplayed();
        Assert.assertTrue(dynamicLoadPage1.errorMessage.isDisplayed());



        }
    @AfterMethod
    public void tearDownMethod() {
        Driver.closeDriver();

    }

}
