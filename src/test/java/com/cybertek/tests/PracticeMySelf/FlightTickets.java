package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FlightTickets {


        WebDriver driver;

        @BeforeMethod
        public void setUpMethod() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.goibibo.com/flights/");
        }

       @Test
        public void windowHandleTest() {

            String parentWindow = driver.getWindowHandle();

            driver.findElement(By.xpath("//img[@src='https://gos3.ibcdn.com/img-1623846067.jpg']")).click();
            driver.switchTo().window(parentWindow);

            driver.findElement(By.xpath("//img[@src='https://gos3.ibcdn.com/img-1623671803.png']")).click();
            driver.switchTo().window(parentWindow);

            Set<String> allHandles = driver.getWindowHandles();

            for (String each : allHandles) {
                driver.switchTo().window(each);
                if (driver.getTitle().contains("IndiGo")) {
                    driver.switchTo().window(each);

                    driver.findElement(By.xpath("(//*[.='Flights'])[1]")).click();
                    driver.findElement(By.xpath("//span[@id='roundTrip']")).click();
                    WebElement from = driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']"));
                    from.sendKeys("JFK");

                    WebElement to = driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']"));
                    to.sendKeys("Istanbul");

                    WebElement date = driver.findElement(By.xpath("//input[@id='departureCalendar']"));
                    date.sendKeys("Wed, 30 Jun");

                    WebElement comeBack = driver.findElement(By.xpath("//input[@id='returnCalendar']"));
                    comeBack.sendKeys("Fri, 2 Jul");

                    WebElement searchBtn = driver.findElement(By.xpath("//*[@id='gi_search_btn']"));
                    searchBtn.click();

                }
            }

        }
    }


