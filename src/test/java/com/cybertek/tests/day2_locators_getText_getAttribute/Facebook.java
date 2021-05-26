package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        String  actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        String check = actualTitle.equals(expectedTitle) ? "Facebook - Log In or Sign Up" : "Failed to detect";
        System.out.println("New Title "+check);


        Thread.sleep(3000);

        WebElement userNameLoginSpace =driver.findElement(By.id("email"));
        userNameLoginSpace.sendKeys("cybertek@school.com");

        WebElement userPasswordSpace = driver.findElement(By.id("pass"));
        userPasswordSpace.sendKeys("Feb21@2021"+ Keys.ENTER);

        Thread.sleep(3000);

       // driver.findElement(By.tagName("div"+Keys.ENTER));
        driver.findElement(By.className("_97w4")).click();

        String  actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Log into Facebook";
        Thread.sleep(3000);

        String check1 = actualTitle1.equals(expectedTitle1) ? "Log into Facebook" : "Failed to detect";
        System.out.println("New Title "+check1);





    }
}
