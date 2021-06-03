package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssignedNadir {
    WebDriver driver;



    @BeforeClass
    public void SetupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
    }
@Test
        public  void userMethod() throws InterruptedException {


        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("user15");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123" + Keys.ENTER);

        //Thread.sleep(2000);
        // WebElement closeButton = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        //        closeButton.click();

        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();
        Thread.sleep(2000);

        WebElement options = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]/../..//div//div//ul//li[3]//a//span"));
        options.click();
//
//        WebElement firstClick = driver.findElement(By.xpath("((//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-LicensePlate'])[1]"));
//        firstClick.click();
//        Thread.sleep(3000);
//        driver.navigate().back();
//
//        String expectedTitle="Car - Entities - System - Car - Entities - System";
//        String actualTitle = driver.getTitle();
//            Assert.assertEquals(actualTitle,expectedTitle, "Verification Passed ");
     WebElement exportGrid = driver.findElement(By.xpath("(//div[@class='btn-group'])[1]"));
     Select select = new Select (exportGrid);
     select.selectByVisibleText("CSV");
     Thread.sleep(2500);
     select.selectByVisibleText("XLSX");

     select.getAllSelectedOptions();

        }
    }

//