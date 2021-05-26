package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupTask2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
   //     driver.manage().window().maximize();

         driver.get("https://chicagofire.com/");
         driver.getTitle();
         String expectedTitle = "Chicago Fire | The Tribute To Chicago-Style Pizza – Founded In Folsom";
         String actualTitle = driver.getTitle();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@href='https://chicagofire.com/order-now/']")).click();
       WebElement choose =  driver.findElement(By.xpath("//*[@href='https://chicagofire.novadine.com/mp/nd/sites/xilan-double-prime/#/'"));
       choose.click();
        driver.findElement(By.xpath("btn btn-default size-default")).click();
        driver.findElement(By.xpath("//*[@id='start-my-order']")).click();
        driver.findElement(By.linkText("Continue as Guest")).click();








    }
}
