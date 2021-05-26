package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlingTask {

    public static void main (String [] args ) {




        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.get("https://www.bing.com/");


    String expectedTitle = "Bing";
    String actualTitle = driver.getTitle();

 if (actualTitle.equals(expectedTitle ) ){
            System.out.println("Passed");
    }
else {
            System.out.println("Failed");
    }


if (driver.getCurrentUrl().contains("bing.com")) {
            System.out.println("Passed");
    }
else {
            System.out.println("Failed");
    }
 driver.findElement(By.className("id_button")).click();



 if (driver.getTitle().equals("Sign in to Bing") ) {
            System.out.println("Passed");
    }
else {
            System.out.println("Failed");
    }

 driver.navigate().back();
}
}