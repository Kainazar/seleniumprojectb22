package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
    public static void main(String[] args) throws InterruptedException {
        // 1 Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        // 2 driver go to "https://www.google.com"
        driver.get("https://www.google.com");
        //driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("mail")).click();
        Thread.sleep(3000);

        String expectedTitle ="Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification Passed");
        } else {
            System.out.println("Failed!!!");
        }
        driver.navigate().back();
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if (actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.close();



    }
}
