package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://google.com");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);


        String expectedSearch = "apple";
        String actualExpected = driver.getTitle();

        if (actualExpected.startsWith(expectedSearch)){
            System.out.println("Good");
        }else{
            System.out.println("Fail");
        }



    }
}
