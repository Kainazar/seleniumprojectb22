package com.cybertek.tests.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfficeHoursUtils1 {

    public static int productAdder(WebDriver driver, String category, String product){
        driver.findElement(By.xpath("//a[.='"+category+"']")).click();
        BrowserUtil.sleep(1);
        driver.findElement(By.xpath("//a[.='"+product+"']")).click();
        BrowserUtil.sleep(1);

        String amountString = driver.findElement(By.xpath("//h3[@class='price-container']")).getText();
        String[] arrayAmount = amountString.split(" ");
        int amount = Integer.parseInt(arrayAmount[0].substring(1));

        driver.findElement(By.xpath("//a[.='Add to cart']")).click();
        BrowserUtil.sleep(1);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        BrowserUtil.sleep(1);
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();

        return amount;
    }

    public static int productRemover(WebDriver driver, String product){
        //     //tbody//tr//td[.='Apple monitor 24']/..//td[.='Delete']/a
        driver.findElement(By.xpath("//a[.='Cart']")).click();
        BrowserUtil.sleep(1);
        int amount = Integer.parseInt(driver.findElement(By.xpath("//tbody//tr//td[.='"+product+"']/..//td[3]")).getText());
        driver.findElement(By.xpath("//tbody//tr//td[.='"+product+"']/..//td[.='Delete']/a")).click();
        BrowserUtil.sleep(3);

        return amount;
    }
}