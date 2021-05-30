package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframes {

//    Create a new class called: IframePractice
//2. Create new test and make set ups
//3. Go to: http://practice.cybertekschool.com/iframe


    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        /**
         * Open Chrome browser
         * 2. Go to http://practice.cybertekschool.com/dropdown
         */
        driver = WebDriverFactory.getDriver("chrome");
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(" http://practice.cybertekschool.com/iframe");
    }
    @Test
    public void iframe_test() {
       //#1 changing to iframe by index we pass index number
       // driver.switchTo().frame(0);

        // #2-Locate as web element to switch
        // We find and Locate <iframe> web element from the page.
         WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        driver.switchTo().frame(iframe);

        // #3 - If <iframe> tag has id or more name attribute, we can pass its attribute value as a string into
        //  driver.switchTo().frame()method directly;
        // driver.switchTo().frame();

        // 4. Assert: “Your content goes here.” Text is displayed.
        WebElement youContentGoesHereText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(youContentGoesHereText.isDisplayed());


        // driver.switchTo().parentFrame();
         driver.switchTo().defaultContent();  // DOING SAME THING ABOVE
        // Locating header Text
        WebElement headerText = driver.findElement(By.xpath("//h3"));

       //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
         Assert.assertTrue(headerText.isDisplayed());
    }
}

