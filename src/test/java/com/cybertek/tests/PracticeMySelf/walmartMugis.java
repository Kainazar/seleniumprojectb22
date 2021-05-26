package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class walmartMugis {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();

        //1.  go to https://www.walmart.com/
        driver.get("https://www.walmart.com");

                //2.  search "bicycle 20"
                Thread.sleep(5000);
        driver.findElement(By.id("global-search-input")).sendKeys("bicycle 20'" + Keys.ENTER);

        //3. choose "Child" in Lifestage checkbox
        driver.findElement(By.id("Child-1-age_group")).click();

        //4.choose "Huffy" in Brand checkbox
        Thread.sleep(3000);
        driver.findElement(By.id("Huffy-0-brand")).click();

        //5. add first bicycle (quantity 2) and the second bicycle (quantity 4) to cart
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[class='button stepper-togglebttn button--ghost button--small']")).click();
        driver.findElement(By.cssSelector("span[class='elc-icon elc-icon-add']")).click();

        driver.findElement(By.xpath("//button[@class='button stepper-togglebttn button--ghost button--small']")).click();
        WebElement secondBikePlusButton = driver.findElement(By.xpath("//span[@class='elc-icon elc-icon-add']"));
        secondBikePlusButton.click();
        secondBikePlusButton.click();
        secondBikePlusButton.click();

        //6. go to cart
        Thread.sleep(5000);
        driver.findElement(By.xpath("//img[@src='//i5.walmartimages.com/dfw/63fd9f59-392b/48a699e6-5299-4b55-8895-28b7af730df3/v1/cart-nav-white.00018279d92b8685ff0d50c146eefe5491200c0b.svg']")).click();

        //7.remove all items from cart
        Thread.sleep(3000);
        WebElement removeItem = driver.findElement(By.xpath("//button[@class='button button--link']"));
        removeItem.click();
        removeItem.click();

    }
}
