package com.cybertek.tests.day6_testng_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PO3_Apple_Task {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();

//         * TC #03: FINDELEMENTS_APPLE
//         * 1. Open Chrome browser
//         * 2. Go to https://www.apple.com/
        driver.get("https://www.apple.com");
//  * 3. Click to all of the headers one by one
// * a. Mac, iPad, iPhone, Watch, TV, Music, Support
        List< WebElement > headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
//         * 4. Print out the titles of the each page
        for (int eachLink = 1; eachLink < headerLinks.size()-1; eachLink++) {

           // System.out.println(headerLinks.get(eachLink).getText());
            headerLinks.get(eachLink).click();

            Thread.sleep(2000);

            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
            System.out.println("Current title in the page: "+driver.getTitle());
        }



//         * 5. Print out total number of links in each page
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("current of number of Link :" + allLinks.size());

        int linksWithNoText= 0;
        int linkWithText = 0;

        for (WebElement each : allLinks) {
            if (each.getText().isEmpty()) {
                linksWithNoText++;
        }else {
                linkWithText++;
            }

        }


        System.out.println();
//         * 6. While in each page:
//         * a. Print out how many link is missing text TOTAL
        System.out.println("Current page Links No text: "+ linksWithNoText );
//         * b. Print out how many link has text TOTAL
        System.out.println("Current page Links with text: "+ linkWithText );
//
    }
}
