package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
//        CSS Practice
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #3: Amazon link number verification
//        1. Open Chrome browser
//        2. Go to https://www.amazon.com/
//        3. Enter search term (use cssSelector to locate search box)
//        4. Verify title contains search term
        WebElement expectedsearBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        expectedsearBox.sendKeys("wooden spoon"+ Keys.ENTER);

        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();

        String titleCheck = actualTitle.contains(expectedTitle) ? "Title Verified" : "Title NOT Verified";
        System.out.println(titleCheck);

    }
}
