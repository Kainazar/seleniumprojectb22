package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        WebElement inputUserName = driver.findElement(By.id("email"));
        Thread.sleep(3000);
        inputUserName.sendKeys("kainazar88@gmail.com");
        WebElement inputPassword = driver.findElement(By.id("pass"));
        Thread.sleep(3000);
        //driver.findElement(By.name("login")).sendKeys();
        inputPassword.sendKeys("some wrong password"+ Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.className("_97w3")).click();
        Thread.sleep(3000);
        WebElement inPutCorrect = driver.findElement(By.name("email"));
        inPutCorrect.sendKeys("bakyt.kainazar@gmail.com");
        Thread.sleep(3000);
       WebElement inputPassword1 = driver.findElement(By.name("pass"));



    }
}
