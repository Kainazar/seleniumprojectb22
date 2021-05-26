package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOrDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.target.com/");
//        driver.findElement(By.xpath("(//*[.='Categories'])[2]")).click();
//
//        WebElement something = driver.findElement(By.id());
        // driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
         driver.findElement(By.xpath("//*[.='Dropdown']//a")).click();
//        WebElement element = driver.findElement(By.id("dropdown"));
//        Select sel = new Select(element);
//        sel.selectByVisibleText("Option 2") ;

        driver.findElement(By.xpath("//*[@id='dropdown']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[.='Option 2']")).click();
         driver.findElement(By.xpath("//*[@id='year']")).click();
         driver.findElement(By.xpath("//*[.='1986']")).click();
         driver.findElement(By.xpath("//*[@id='month']")).click();
         driver.findElement(By.xpath("//*[.='January']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("day")).click();
        driver.findElement(By.xpath("//*[.='7']")).click();
         driver.findElement(By.id("state")).click();
        Thread.sleep(2000);
         driver.findElement(By.xpath("//*[.='Illinois']")).click();
        Thread.sleep(2000);
         driver.findElement(By.xpath("//*[.='Java']")).click();
         driver.findElement(By.id("dropdownMenuLink")).click();
        Thread.sleep(2000);
         driver.findElement(By.xpath("//*[.='Google']")).click();
        Thread.sleep(3000);


        if  (driver.getTitle().equalsIgnoreCase("google")) {
            System.out.println("Verification Passed");
        }else {
            System.out.println("Verification Failed");
        }
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[.='Radio Buttons']//a")).click();
driver.findElement(By.id("yellow")).click();
        Thread.sleep(2000);
driver.findElement(By.xpath("//*[.='Basketball']")).click();
        Thread.sleep(2000);
driver.navigate().back();
        }

    }

