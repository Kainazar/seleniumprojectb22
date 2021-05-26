package com.cybertek.tests.day1_selenuim_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) {
        /**
         * TC #1: Yahoo Title Verification
         * 1. Open Chrome browser
         * 2. Go to https://www.yahoo.com
         * 3. Verify title:
         * Expected: Yahoo
         */
        WebDriverManager.chromedriver().setup();

        WebDriver driver  = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");
        driver.getTitle();

        String ExpectedTitle = "Yahoo";
        System.out.println("Expected: " + ExpectedTitle);
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(ExpectedTitle)){
            System.out.println("Title is as expected PASSED");
        }else{
            System.out.println("Title is as expected Failed");
        }


    }
}
