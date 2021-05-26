package com.cybertek.tests.day1_selenuim_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Another_Task {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver today = new ChromeDriver();
        today.manage().window().maximize();

        }



    }

