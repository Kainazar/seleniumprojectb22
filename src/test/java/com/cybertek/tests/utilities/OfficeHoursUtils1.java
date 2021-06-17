package com.cybertek.tests.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfficeHoursUtils1 {
    static String userName = "kainazar";
    static String password = "bakyt123456";
    public static WebElement userNameBox (WebDriver driver){
        return driver.findElement(By.name("username"));
    }
    public static WebElement passwordBox(WebDriver driver){
        return driver.findElement(By.name("password"));
    }

    public static int productAdder(WebDriver driver, String category, String product){
        driver.findElement(By.xpath("//a[.='"+category+"']")).click();
        BrowserUtil.sleep(1);
        driver.findElement(By.xpath("//a[.='"+product+"']")).click();
        BrowserUtil.sleep(1);

        String amountString = driver.findElement(By.xpath("//h3[@class='price-container']")).getText();
        String[] arrayAmount = amountString.split(" ");
        int amount = Integer.parseInt(arrayAmount[0].substring(1));

        driver.findElement(By.xpath("//a[.='Add to cart']")).click();
        BrowserUtil.sleep(1);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        BrowserUtil.sleep(1);
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();

        return amount;
    }

    public static int productRemover(WebDriver driver, String product){
        //     //tbody//tr//td[.='Apple monitor 24']/..//td[.='Delete']/a
        driver.findElement(By.xpath("//a[.='Cart']")).click();
        BrowserUtil.sleep(1);
        int amount = Integer.parseInt(driver.findElement(By.xpath("//tbody//tr//td[.='"+product+"']/..//td[3]")).getText());
        driver.findElement(By.xpath("//tbody//tr//td[.='"+product+"']/..//td[.='Delete']/a")).click();
        BrowserUtil.sleep(3);

        return amount;
    }
    public static void addUserTest(WebDriver driver, String url) {
        driver.get(url);
        userNameBox(driver).sendKeys(userName);
        passwordBox(driver).sendKeys(password);
        driver.findElement(By.xpath("//input[@name='FormsButton2']")).click();

    }
    public static boolean positiveLoginTest(WebDriver driver, String url) throws InterruptedException {
        driver.get(url);
        userNameBox(driver).sendKeys(userName);
        passwordBox(driver).sendKeys(password);
        driver.findElement(By.xpath("//input [@value='Test Login']"));
        Thread.sleep(3000);
        WebElement successMessage = driver.findElement(By.xpath("//b[.='**Successful Login**']"));
        return  successMessage.isDisplayed();

    }
    public static boolean negativeLoginTest(WebDriver driver,String url) throws InterruptedException {
        driver.get(url);
        userNameBox(driver).sendKeys(userName.substring(1));
        passwordBox(driver).sendKeys(password);
        driver.findElement(By.xpath("//input [@value='Test Login']"));
        Thread.sleep(3000);
        WebElement failMessage = driver.findElement(By.xpath("//b[.='**Failed Login**']"));
        return failMessage.isDisplayed();
    }
}