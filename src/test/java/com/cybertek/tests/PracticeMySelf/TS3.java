package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TS3 {
    WebDriver driver;



    @BeforeClass
    public void SetupClass() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
   //   driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");

        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("user13");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(2500);

    }
@Test
        public  void TC() throws InterruptedException {
    driver.findElement(By.xpath("(//span[@class='title title-level-1'])[3]")).click();
    driver.findElement(By.xpath("((//span[@class='title title-level-1'])[3]//..//..//..)[13]")).click();

    Thread.sleep(2500);
    WebElement createCalendarEvent = driver.findElement(By.xpath("//div[@class='pull-right title-buttons-container']"));
    createCalendarEvent.click();
    Thread.sleep(2500);

    WebElement fillEmptyPlaces = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
    fillEmptyPlaces.sendKeys("B22");
    Thread.sleep(2500);


    driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
    Thread.sleep(2500);
    }

        }


