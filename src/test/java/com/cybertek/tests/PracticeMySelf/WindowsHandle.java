package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowsHandle {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");



     }

     @Test
    public void multiple_windows () throws InterruptedException {

         Thread.sleep(3000);
         ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
         ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
         ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

         for (String each : driver.getWindowHandles()) {
             driver.switchTo().window(each);
             System.out.println("Title is current page : "+driver.switchTo().window(each));
       //    if (driver.getCurrentUrl().contains("etsy"))

             if (driver.getTitle().contains("Etsy")) {
                 Assert.assertTrue(driver.getTitle().contains("Etsy"));

//                 String expectTitle = "Etsy";
//                 String actualTitle = driver.getTitle();
//
//               SoftAssert softAsset = new SoftAssert();
//                 softAsset.assertEquals(actualTitle, expectTitle);


                 Thread.sleep(3000);
                 WebElement element = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
                 element.sendKeys("Wooden Spoon"+ Keys.ENTER);

                 WebElement choose1= driver.findElement(By.xpath("(//div[@class='height-placeholder'])[3]"));
                 choose1.click();

                 Thread.sleep(3000);
                 WebElement type =driver.findElement(By.xpath("//*[@data-buy-box-region='buttons']"));
                 Thread.sleep(3000);
                 type.click();
                 //driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
                break;


             }
         }
     }
  }
