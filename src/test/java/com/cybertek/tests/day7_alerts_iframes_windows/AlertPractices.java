package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractices {
    WebDriver driver;



     @BeforeMethod
    public void setupMethod() {
 //     * 1. Open browser
 //     * 2. Go to website: http://practice.cybertekschool.com/javascript_alerts
         driver =  WebDriverFactory.getDriver("chrome");
         // driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         driver.get("http://practice.cybertekschool.com/javascript_alerts");
     }
     @Test
    public void information_alert_test() throws InterruptedException {

 //     * 3. Click to “Click for JS Alert” button
         WebElement choose1 = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
         choose1.click();
         Thread.sleep(3000);

 //     * 4. Click to OK button from the alert
         Alert alert = driver.switchTo().alert();
         alert.accept();
         Thread.sleep(3000);


 //     * 5. Verify “You successfuly clicked an alert” text is displayed
         WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
         String expectedText= "You successfuly clicked an alert";
         String actualText = resultText.getText();

         Assert.assertTrue(resultText.isDisplayed(), "Result Text is Not displayed on the page");
         Assert.assertEquals(actualText, expectedText, "Actual Text is not as expected.");

     }
     @Test
    public void information_alertTest() throws InterruptedException {
//         3. Click to “Click for JS Confirm” button
         WebElement chose2 = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
         chose2.click();
         Thread.sleep(3000);

//         4. Click to OK button from the alert
         Alert alert1 = driver.switchTo().alert();
         Thread.sleep(3000);
         alert1.accept();


//         5. Verify “You clicked: Ok” text is displayed.
         WebElement resultText1 = driver.findElement(By.xpath("//p[@id='result']"));
         String expectedText1= "You clicked: Ok";
         String actualText1 = resultText1.getText();

         Assert.assertTrue(resultText1.isDisplayed());
         Assert.assertEquals(actualText1, expectedText1);


     }
     @Test
    public void information_tc3 () throws InterruptedException {
//         3. Click to “Click for JS Prompt” button
         WebElement chose3 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
         chose3.click();
         Thread.sleep(3000);

//         4. Send “hello” text to alert
         Alert alert2 = driver.switchTo().alert();
         alert2.sendKeys("hello");
         Thread.sleep(3000);

//         5. Click to OK button from the alert
         alert2.accept();
//         6. Verify “You entered: hello” text is displayed.
     }
}
