package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Walmart2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://walmart.com");
        driver.findElement(By.xpath("//*[@id='global-search-input']")).sendKeys("bycicle 20'"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='Child-1-age_group']")).click();

        driver.findElement(By.xpath("//*[@id='Huffy-0-brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Huffy 20-Inch Rock It Boys Bike , Royal Blue Gloss")).click();

        driver.findElement(By.xpath("//*[@id=\"add-on-atc-container\"]/div[1]/section/div[1]/div[2]/select")).click();

        driver.findElement(By.xpath("//*[@id=\"add-on-atc-container\"]/div[1]/section/div[1]/div[2]/select/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='button spin-button prod-ProductCTA--primary button--primary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='i_a bh_b header-GlobalSearch-input mweb-Typeahead-input i_b']")).sendKeys("Huffy"+Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"searchProductResult\"]/ul/li[4]/div/div[2]/div[5]/div/a/span")).click();

        //driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"searchProductResult\"]/ul/li[2]/div/div[2]/div[5]/div")).click();

        driver.findElement(By.xpath("//*[@class='button spin-button prod-ProductCTA--primary button--primary']")).click();


    }
}
