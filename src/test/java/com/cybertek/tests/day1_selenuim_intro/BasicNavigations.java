package com.cybertek.tests.day1_selenuim_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web driver
        // this line opens a browser
        WebDriver driver = new ChromeDriver();

        // this line will be basically maximize the page helps selenium
        driver.manage().window().maximize();

        //3- get the page for Tesla.com
        driver.get("https://www.tesla.com");

        System.out.println("Current title: "+driver.getTitle());

        //putting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(3000);
String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //Going back using navigations
        driver.navigate().back();

        //putting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(3000);

        //Going forward using navigations
        driver.navigate().forward();

        //putting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(3000);

        //refreshing the page using navigations
        driver.navigate().refresh();

        //putting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(3000);

        //going to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: "+driver.getTitle());
        currentUrl= driver.getCurrentUrl();

        // will work for mac only  similar  maximize
        // driver.manage().window().fullscreen();

        // this method will close the currently opened browser
        // driver.close();

        // will close all of the opened browsers or tabs with in same session
        // driver.quit();






        

    }

}
