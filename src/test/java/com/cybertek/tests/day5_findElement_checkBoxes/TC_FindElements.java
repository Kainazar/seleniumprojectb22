package com.cybertek.tests.day5_findElement_checkBoxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC_FindElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/forgot_password");
//        TC #0: FINDELEMENTS
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/forgot_password
//        3. Print out the texts of all links
//        4. Print out how many total link
        List <WebElement> linkOfLinks = driver.findElements(By.xpath("//body//a"));
        for (WebElement each : linkOfLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }
        for (WebElement ofLink : linkOfLinks) {
            System.out.println(ofLink.getText());
        }
        int numberOfLinks = linkOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);
    }
}
