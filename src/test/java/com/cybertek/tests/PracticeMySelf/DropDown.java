package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.xpath("//*[.='Dropdown']//a")).click();
        WebElement element = driver.findElement(By.id("dropdown"));
        Thread.sleep(2000);

        Select sel = new Select(element);
        sel.selectByVisibleText("Option 2") ;
        Thread.sleep(2000);

        WebElement dataBirthYear = driver.findElement(By.id("year"));
        Select dataBirthYear1 = new Select(dataBirthYear);
        dataBirthYear1.selectByVisibleText("1986");

        Thread.sleep(2000);
        WebElement year= driver.findElement(By.id("month"));
        Select mouth = new Select(year);
        mouth.selectByVisibleText("January");
        Thread.sleep(2000);

        WebElement data= driver.findElement(By.id("day"));
        Select data1 = new Select(data);
        data1.selectByVisibleText("7");
        Thread.sleep(2000);

        WebElement state = driver.findElement(By.id("state"));
        Select stat1 = new Select (state);
        stat1.selectByValue("NY");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[.='Java']")).click();
        driver.findElement(By.xpath("//*[@id='dropdownMenuLink']")).click();
        driver.findElement(By.xpath("//*[.='Google']")).click();
        Thread.sleep(2000);

       // System.out.println("First option select "+element.getText());
        System.out.println("First option select "+dataBirthYear.getText());
        System.out.println("First option select "+year.getText());
        System.out.println("First option select "+data.getText());
        System.out.println("First option select "+state.getText());


        driver.close();

    }
}
