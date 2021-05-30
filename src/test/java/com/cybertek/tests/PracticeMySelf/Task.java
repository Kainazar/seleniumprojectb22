package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://bch.cbd.int/database/organisms/");

        WebElement element = driver.findElement(By.xpath("(//*[@style='Width: 100%;'])[1]"));
        Select drop1 = new Select(element);
        drop1.selectByVisibleText("Gene Registry");

        WebElement element1 = driver.findElement(By.xpath("(//*[contains(@ onchange,'onchange')])[1]"));
        Select drop2 = new Select(element1);
        drop2.selectByVisibleText("Filter by technique used");

//        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"E1750138\"]"));
//        Select drop3 = new Select(element2);
//        drop3.selectByValue("Specifically");

//        WebElement element3 = driver.findElement(By.xpath("//*[@id='E1285865']"));
//        Select drop4 = new Select(element3);
//        drop4.selectByVisibleText("Cell fusion");

        WebElement element5 = driver.findElement(By.xpath("(//*[@style='Width: 100%;'])[4]"));
        Select drop6 = new Select(element5);
        drop6.selectByVisibleText("Filter by gene name");

        WebElement element4 = driver.findElement(By.xpath("//*[@id=\"E1562155\"]"));
        Select drop5 = new Select(element4);
        drop5.selectByValue("6d8cc412-3e89-4a88-b9b4-26838d2a2c3e");

        WebElement element6 = driver.findElement(By.xpath("//*[@id=\"E1562182\"]"));
        Select drop7 = new Select (element6);
        drop7.selectByVisibleText("Filter by common name");

        WebElement element7 = driver.findElement(By.xpath("//*[@name='E1562196']"));
        Select drop8 = new Select (element7);
        drop8.selectByValue("ACMV");

        WebElement element8 = driver.findElement(By.xpath("//*[@id=\"E1562210\"]"));
        Select drop9 = new Select (element8);
        drop9.selectByVisibleText("BVDV-2");

        WebElement element9 = driver.findElement(By.xpath("//*[@id=\"E1562252\"]"));
        Select drop10 = new Select (element9);
        drop10.selectByValue("2021-04-29");

        System.out.println(drop1.getFirstSelectedOption().getText());
        System.out.println(drop2.getFirstSelectedOption().getText());
        //System.out.println(drop3.getFirstSelectedOption().getText());
        //System.out.println(drop4.getFirstSelectedOption().getText());
        System.out.println(drop6.getFirstSelectedOption().getText());
        System.out.println(drop5.getFirstSelectedOption().getText());
        System.out.println(drop7.getFirstSelectedOption().getText());
        System.out.println(drop8.getFirstSelectedOption().getText());
        System.out.println(drop9.getFirstSelectedOption().getText());
        System.out.println(drop10.getFirstSelectedOption().getText());

    }
}

