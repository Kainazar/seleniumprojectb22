package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vytrack {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://vytrack.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("menu-item-849")).click();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("prependedInput"));
        Thread.sleep(2000);
        userName.sendKeys("salesmanager113");
        Thread.sleep(2000);
        WebElement userPassword = driver.findElement(By.id("prependedInput2"));
        Thread.sleep(2000);
        userPassword.sendKeys("UserUser123");
        Thread.sleep(2000);
        driver.findElement(By.id("_submit")).click();

        if (driver.getTitle().equalsIgnoreCase("Dashboard")) {
            System.out.println("Verification is Passed!");
        } else {
            System.out.println("Verification is Failed");
        }

    }
}
