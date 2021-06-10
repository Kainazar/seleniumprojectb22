package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TS2_3 {
    WebDriver driver;

    @BeforeClass
    public void SetupClass() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        //   driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");

        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("user13");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(1500);

    }

    @Test
    public void TC() throws InterruptedException {
        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();
        Thread.sleep(1500);

        WebElement vehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
        Assert.assertTrue(vehicle.getText().equals("Vehicles"));
        vehicle.click();
        Thread.sleep(1500);

        WebElement cybertek123 = driver.findElement(By.xpath("(//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-LicensePlate'])[1]"));
        cybertek123.click();
        Thread.sleep(1500);

        driver.navigate().back();

        WebElement choose1 = driver.findElement(By.xpath("(//div[@class='btn-group'])[1]"));
        choose1.click();
        WebElement csv = driver.findElement(By.xpath("//a[@data-index='0']"));
        csv.click();
        Thread.sleep(5000);

        WebElement popAlert = driver.findElement(By.xpath("(//i[@class='fa-upload'])[3]"));
        Thread.sleep(2000);
        popAlert.getText();

        String expectedAlert = "Export started successfully. You will receive email notification upon completion.";
        String actualAlert = popAlert.getText();

        if (expectedAlert.contains(actualAlert)) {
            System.out.println("Verification Passed ");
        } else {
            System.out.println("Verification is Failed ");
        }
        System.out.println(popAlert.getText());

        WebElement settings = driver.findElement(By.xpath("//div[@class='column-manager dropdown']"));
        settings.click();

        List<WebElement> checkBox = driver.findElements(By.xpath("//*[@class='visibility-cell']"));
        for (WebElement  unselected : checkBox) {
            Thread.sleep(1000);
            unselected.click();
        }

        Thread.sleep(2000);
        List<WebElement> checkbox2 = driver.findElements(By.xpath("//*[@class='visibility-cell']"));
        for (WebElement selected : checkbox2) {
            Thread.sleep(1000);
            selected.click();

        }
    }
}
