package com.cybertek.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtils {

    public  static void  loginLibrary (WebDriver driver){
        //  3. Enter username: “”
        WebElement userName = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        userName.sendKeys("student11@library ");

        //    4. Enter password: “”
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        userPassword.sendKeys("tScBPCUr");

        //    5. Click to Login button
        WebElement summitButton =  driver.findElement(By.xpath("//button[.='Sign in']"));
        summitButton.click();
    }


}
