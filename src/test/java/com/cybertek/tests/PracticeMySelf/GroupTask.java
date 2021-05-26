package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ecosia.org");

        driver.getTitle();
        String expectedTitle = "Ecosia - the search engine that plants trees";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Verification is Passed");
        }else{
            System.out.println("Verification is Failed");
        }

       WebElement ToggleMenu = driver.findElement(By.className("main-nav"));
       ToggleMenu.click();

        Thread.sleep(1000);
       WebElement AboutUs = driver.findElement(By.linkText("About us"));
       AboutUs.click();
       driver.getTitle();
        Thread.sleep(1000);

       String expectedTitle1 = "About Ecosia and the Team";
       String actualTitle1 = driver.getTitle();

       if (actualTitle1.contains(expectedTitle1)) {
           System.out.println("Correct!");
       }else{
           System.out.println("Not Correct");
       }

       driver.navigate().back();
       String expectedBackTitle = "Ecosia - the search engine that plants trees";
       String actualBackTitle = driver.getTitle();

       if (actualBackTitle.equals(expectedBackTitle)) {
           System.out.println("Correct");
       }else{
           System.out.println("Not Correct");
       }

       WebElement searchBox = driver.findElement(By.name("q"));

       searchBox.sendKeys("java"+ Keys.ENTER);
        Thread.sleep(1000);
        driver.getTitle();
        String ExpectedJavaTitle = "java - Ecosia";
        String actualJavaTitle = driver.getTitle();

        if (actualJavaTitle.equals(ExpectedJavaTitle)) {
            System.out.println("Correct");
        }else{
            System.out.println("Not Correct");
        }

        WebElement clickHomePicture = driver.findElement(By.className("logo-anchor"));

        clickHomePicture.click();

        String expectedBackTitle2 = "Ecosia - the search engine that plants trees";
        String actualBackTitle2 = driver.getTitle();

        if (actualBackTitle2.equals(expectedBackTitle2)) {
            System.out.println("Correct");
        }else{
            System.out.println("Not Correct");
        }
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement userName = driver.findElement(By.name("ctl00$MainContent$username"));
        userName.sendKeys("Tester"+Keys.ENTER);
        Thread.sleep(1000);
WebElement userPassword = driver.findElement(By.name("ctl00$MainContent$password"));
userPassword.sendKeys("test"+Keys.ENTER);

String expectedTitle3 = "Web Orders";
String actualTitle3 = driver.getTitle();

if (actualTitle3.equals(expectedTitle3)) {
    System.out.println("Correct");
}else{
    System.out.println("Not Correct");


}



    }
}
