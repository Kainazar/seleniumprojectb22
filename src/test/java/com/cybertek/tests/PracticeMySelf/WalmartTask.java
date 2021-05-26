package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
//        1.  go to https://www.walmart.com/
//        2.  search      bycicle 20'
//        3. choose "Child"  in   Lifestage checkbox
//        4.choose "Huffy" in Brand checkbox
//        5.add the first bycicle  (quantity 2) and the second bycicle (quantity 4) to cart
//        6. go to cart
//        7.remove all items from cart
        driver.get("https://walmart.com");
        Thread.sleep(2000);
        WebElement findSearch = driver.findElement(By.name("query"));
        findSearch.click();
        findSearch.sendKeys("bycicle 20'"+ Keys.ENTER);
        Thread.sleep(2000);
        WebElement childBox = driver.findElement(By.id("Child-1-age_group"));
        childBox.click();
         driver.findElement(By.id("Huffy-0-brand")).click();
        Thread.sleep(2000);
           driver.findElement(By.linkText("Huffy 20-Inch Rock It Boys Bike , Royal Blue Gloss")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("select[class='field-input field-input--secondary']"));
       driver.findElement(By.cssSelector("div[class='visuallyhidden']")).click();
       Thread.sleep(2000);
     //driver.findElement(By.xpath("//*[@id=add-on-atc-container]/div[1]/section/div[1]/div[2]/select")).click();
//       Thread.sleep(2000);








    }
}
