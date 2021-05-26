package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();  //TITLE IS NOT VERIFIED

        driver.get("http://facebook.com");


        driver.findElement(By.name("email")).sendKeys("dhfgshdgdf");
        driver.findElement(By.id("pass")).sendKeys("FGTRHSH");
        driver.findElement(By.name("login")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Log into Facebook";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verified");
        } else {
            System.out.println("Title is NOT verified");
        }
    }
}

