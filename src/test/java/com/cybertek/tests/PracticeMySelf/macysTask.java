package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class macysTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://macys.com");
       WebElement searBox1 =  driver.findElement(By.id("globalSearchInputField"));
       searBox1.sendKeys("women shoes"+ Keys.ENTER);
       driver.findElement(By.className("moreSwatchesLink")).click();



    }
}
