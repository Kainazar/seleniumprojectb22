package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/inputs");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.className("nav-link")).click();

        String currentTitle = driver.getTitle();
        String expectedTitle = "Practice";
        if (currentTitle.contains(expectedTitle)) {
            System.out.println("Passed");
        } else {
            System.out.println("Not Passed");
            driver.close();

        }
    }
}
