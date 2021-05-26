package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork1 {
    public static void main(String[] args) {
//        TC #0: FINDELEMENTS
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//   2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com");

//        3. Print out the texts of all links
        List <WebElement> linkOfLinks = driver.findElements(By.xpath("//body//a"));
        for (WebElement each : linkOfLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }
        for (WebElement ofLink : linkOfLinks) {
            System.out.println(ofLink.getText());

        }//  6. Print out how many total link
        int numberOfLinks = linkOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);
    }
}
//        4. Print out how many link is missing text
//        5. Print out how many link has text



