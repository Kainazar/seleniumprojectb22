package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TC3DropDown {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1922");

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("11");

        Select data = new Select (driver.findElement(By.id("day")));
        data.selectByIndex(0);

        String expectedYear = "1922";
        String actualYear = year.getFirstSelectedOption().getText();

        if (actualYear.contains(expectedYear)) {
            System.out.println("Verification is Passed! ");
        } else {
            System.out.println("Verification is Failed!");
        }

        String expectedMonth = "December";
        String actualMoth = month.getFirstSelectedOption().getText();

        if (actualMoth.contains(expectedMonth)) {
            System.out.println("Verification is Passed! ");
        } else {
            System.out.println("Verification is Failed!");
        }

        System.out.println();
        System.out.println(year.getFirstSelectedOption().getText());
        System.out.println(month.getFirstSelectedOption().getText());
        System.out.println(data.getFirstSelectedOption().getText());

        driver.close();
    }
}
