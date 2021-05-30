package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC4DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");


      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      Select allOptions = new Select (driver.findElement(By.id("month")));
      allOptions.selectByVisibleText("January");
      allOptions.selectByValue("1");
      allOptions.selectByIndex(2);
      allOptions.selectByVisibleText("April");
      allOptions.selectByValue("4");
      allOptions.selectByIndex(5);
      allOptions.selectByVisibleText("July");

      Thread.sleep(3000);

      List <WebElement> selectMoth = allOptions.getAllSelectedOptions();

        for (WebElement each : selectMoth) {
            System.out.println("Select Month "+ each.getText());

        }
        List <WebElement> allMoth = allOptions.getOptions();

        for (WebElement monthAll : allMoth) {
            System.out.println("all Month "+ monthAll.getText());

        }



    }
}
