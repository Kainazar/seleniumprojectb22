package com.cybertek.tests.day6_testng_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P0_Checkbox_Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
//        Practice: Cybertek Checkboxes
// 1. Go to http://practice.cybertekschool.com/checkboxes



        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        // 2. Confirm checkbox #1 is NOT selected by default
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
  // 3. Confirm checkbox #2 is SELECTED by default
        // 2. Confirm checkbox #1 is NOT selected by default
        if (!checkBox1.isSelected()) {
            System.out.println("Check Box #1 is not selected. Verification is Passed!");
        } else {
            System.out.println("Check Box #1 is not selected. Verification is Failed");
        }

        if (checkBox2.isSelected()) {
            System.out.println("Check Box #2 is not selected. Verification is Passed!");
        } else {
            System.out.println("Check Box #2 is not selected. Verification is Failed");
        }

// 4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkBox1.click();

        // 5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkBox2.click();

        // 6. Confirm checkbox #1 is SELECTED.
        if (checkBox1.isSelected()) {
            System.out.println("Check Box #1 is not selected. Verification is Passed!");
        } else {
            System.out.println("Check Box #1 is not selected. Verification is Failed");

            // 7. Confirm checkbox #2 is NOT selected.
            if (!checkBox1.isSelected()) {
                System.out.println("Check Box #2 is not selected. Verification is Passed!");
            } else {
                System.out.println("Check Box #2 is not selected. Verification is Failed");
            }
        }
        driver.close();
    }
}
