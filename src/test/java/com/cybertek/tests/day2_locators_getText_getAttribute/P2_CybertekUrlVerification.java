package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) throws InterruptedException {
        /**
         * TC #2: Cybertek practice tool verifications
         * 1. Open Chrome browser
         * 2. Go to https://practice.cybertekschool.com
         * 3. Verify URL contains
         * Expected: cybertekschool
         * 4. Verify title:
         *  Expected: Practice
         */


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        //navigate to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        //verify URL contains Expected:cybertekschool
        driver.getCurrentUrl().contains("cybertekschool");

        //verify title matches expected
        String expectedTitle ="Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Navigation verified. PASSED!!!");
        } else {
            System.out.println("Navigation could not be verified. Failed!!!");
        }

        Thread.sleep(2000);

        //close the window
        driver.close();

    }
    }

