package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GroupTaskTarget {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
    //  driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.get("https://target.com");

        List<WebElement> linkOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement num : linkOfLinks) {



            if (num.getText().contains("40") ){
                System.out.println(num.getText());
            }


        }



        }


    }

