package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EvgeniiCode {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://bch.cbd.int/database/organisms/");

        WebElement registies = driver.findElement(By.xpath("(//select[@style='Width: 100%;'])[5]"));
        Select selectFive=new Select(registies);
        // selectFive.selectByIndex(1);

        List<WebElement> dropDowns = driver.findElements(By.xpath("//select[@style='Width: 100%;']"));
        Select [] select=new Select[dropDowns.size()];

        for (int i=0; i<select.length; i++){
            select[i]=new Select(dropDowns.get(i));
            System.out.println(select[i].getFirstSelectedOption().getText());
        }
        select[3].selectByIndex(1);
        select[0].selectByIndex(2);
        select[1].selectByIndex(3);
        select[2].selectByIndex(1);

        WebElement html = driver.findElement(By.tagName("html"));
        html.sendKeys(Keys.ARROW_DOWN);

        select[4].selectByIndex(3);

        dropDowns=driver.findElements(By.xpath("//select[@style='Width: 100%;']"));
        select=new Select[dropDowns.size()];

        for (int i=0; i<select.length; i++){
            select[i]=new Select(dropDowns.get(i));
            //  System.out.println(select[i].getFirstSelectedOption().getText());
        }

        select[2].selectByIndex(2);
        select[4].selectByIndex(9);
        select[6].selectByIndex(10);
        select[7].selectByIndex(11);

        for (int i=0; i<select.length; i++){
            System.out.println(select[i].getFirstSelectedOption().getText());
        }

    }

}


