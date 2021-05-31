package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class GroupTaskTicket {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.aa.com/booking/find-flights?redirectSearchToLegacyAACom=false");

        WebElement oneWay = driver.findElement(By.xpath("//span[.='One way']"));
        oneWay.click();

        WebElement toGo = driver.findElement(By.xpath("//input[@id='segments0.destination']"));
        toGo.sendKeys("chicago");

        WebElement timeOfDay = driver.findElement(By.xpath("//select[@id='segments0.travelTime']"));
        Select timeOfDaySelect = new Select(timeOfDay);

        timeOfDaySelect.selectByVisibleText("Evening");

        WebElement passengerCount = driver.findElement(By.xpath("//select[@id='passengerCount']"));
        Select passengerCountSelect = new Select(passengerCount);
        passengerCountSelect.selectByValue("2");

        WebElement passengerAge = driver.findElement(By.xpath("//select[@id='passengers0.passengerType']"));
        Select passengerAgeSelect = new Select(passengerAge);
        passengerAgeSelect.selectByIndex(3);
    }

}
