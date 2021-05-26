package com.cybertek.tests.day1_selenuim_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver cybertek = new ChromeDriver();

        cybertek.manage().window().maximize();
        cybertek.get(" https://www.cybertekschool.com");
        cybertek.getTitle();
        String expectedTitle = "Cybertek";
        System.out.println("Expected Title: " + expectedTitle);
        String actualTitle = cybertek.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("You Successful expected ");
        }else{
            System.out.println("Try One More Time");
        }

    }
}
