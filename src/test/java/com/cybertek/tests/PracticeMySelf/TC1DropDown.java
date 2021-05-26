package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");


//        WebElement element = driver.findElement(By.id("state"));
        Select select = new Select(driver.findElement(By.id("state")));
        Thread.sleep(2500);

        select.selectByVisibleText("Illinois");
        Thread.sleep(2500);

        select.selectByValue("VA");
        Thread.sleep(2500);
        select.selectByVisibleText("California");

        Thread.sleep(2500);


        Select sel = new Select(driver.findElement(By.id("state")));

        for (WebElement element : sel.getOptions()) {
            System.out.println(element.getText());


        }


        Thread.sleep(2500);
        driver.close();
    }
}

