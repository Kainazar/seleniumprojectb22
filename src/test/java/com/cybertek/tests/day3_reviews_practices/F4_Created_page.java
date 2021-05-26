package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_Created_page {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://facebook.com");
        String expectedInHref = "Create a Page";

      WebElement createdPageLink = driver.findElement(By.linkText("Create a Page"));
        driver.findElement(By.id("reg_pages_msg")).click();

    }
}
