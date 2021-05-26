package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Target {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com/");
//        driver.findElement(By.xpath("(//*[.='Categories'])[2]")).click();
//
//        List< WebElement > links = driver.findElements(By.xpath("//*[@class='NavigationListItem-ljyubl-0 chzHFE']"));
//
//        for (WebElement each : links) {
//
//            Thread.sleep(2000);
//            System.out.println("Return text ---> "+ each.getText() );
//        }
//            Thread.sleep(2000);

        driver.findElement(By.linkText("Categories")).click();
        List<WebElement> links = driver.findElements(By.xpath("//ul[@aria-label='Categories menu']//li"));

        for (WebElement each : links) {

            Thread.sleep(500);
            System.out.println("Return text ---> "+ each.getText() );
        }
        Thread.sleep(2000);
    }

}

