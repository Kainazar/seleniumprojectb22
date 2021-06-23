package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpLoadPractice {
    @Test
    public void upload_test(){

        //1. Go to http://practice.cybertekschool.com/upload
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        String path = "/Users/nurzada8/Downloads/Actions_Presentation_Class (1).pdf";

        //3. Upload the file.
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));




        //Sending the file path to the chooseFile WebElement
        chooseFile.sendKeys(path);

        //click to upload button
        uploadButton.click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedMessage.isDisplayed());

        Driver.closeDriver();
    }
@Test
    public void scrolling_test() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com");

    Actions actions = new Actions(Driver.getDriver());

    WebElement cybertekSchool = Driver.getDriver().findElement(By.linkText("Cybertek School"));

    actions.moveToElement(cybertekSchool).perform();

    actions.sendKeys(Keys.PAGE_UP).perform();
    Thread.sleep(3000);
    actions.sendKeys(Keys.PAGE_DOWN).perform();
}
}