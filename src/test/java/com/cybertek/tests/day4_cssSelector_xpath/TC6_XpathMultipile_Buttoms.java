package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6_XpathMultipile_Buttoms {
    public static void main(String[] args) {
//        TC #6: XPATH LOCATOR practice
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/multiple_buttons
//        3. Click on Button 1
//        4. Verify text displayed is as expected:
//        Expected: “Clicked on button one!”
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //WebElement buttom = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        WebElement button = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button.click();
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();

        if (actualText.equals(expectedText)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

    }
}
