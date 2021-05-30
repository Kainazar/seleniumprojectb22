package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Loropiana2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://us.loropiana.com/en/");

    }

    @Test(priority = 1)
    public void chooseItem() {
         driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        WebElement man = driver.findElement(By.xpath("(//*[@class='t-nav1 '])[4]"));
        man.click();

        WebElement category = driver.findElement(By.xpath("//a[@href = 'https://us.loropiana.com/en/c/man/" +
                "accessories/sunglasses']"));
        category.click();

        WebElement choose1 = driver.findElement(By.xpath("(//*[@class='t-h3'])[3]"));
        choose1.click();

        WebElement chooseSize = driver.findElement(By.xpath("//*[@id='pdp-size-selector']"));
        chooseSize.click();

        WebElement choose = driver.findElement(By.xpath("(//*[@class='sizeoption t-sub-h3-med grey'])[2]"));
        choose.click();

        WebElement choose3 = driver.findElement(By.xpath("//*[@class='main-button t-cta sticky-mobile gold']"));
        choose3.click();

        WebElement choose4 = driver.findElement(By.xpath("//*[@class='t-sub-h3-med plus-btn']"));
        choose4.click();

        WebElement choose5 = driver.findElement(By.xpath("//*[@aria-label='proceed to checkout']"));
        choose5.click();

        WebElement userName= driver.findElement(By.id("j_username"));
        userName.sendKeys("batch22@yahoo.com");

        WebElement password = driver.findElement(By.id("j_password"));
        password.sendKeys("Feb21@2021");

        driver.findElement(By.xpath("(//*[@aria-label='Newsletter'])[1]")).click();
        driver.findElement(By.xpath("(//*[@class='main-button t-cta gold'])[2]")).click();

       WebElement remove = driver.findElement(By.xpath("(//*[@class='c-checkBox__input'])[2]"));
       remove.click();



        WebElement checkOut = driver.findElement(By.xpath("//*[@class='main-button t-cta gold h-mt-20 h-mb-20']"));
        checkOut.click();

        driver.close();
    }
}

