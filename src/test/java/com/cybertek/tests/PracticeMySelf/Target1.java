package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://target.com");
        driver.findElement(By.xpath("(//*[@id='secondary'])[1]")).click();
        driver.findElement(By.xpath("(//*[@class='Row-uds8za-0 glDPjN'])[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("(//*[@class='ItemTitle-yw3r8r-0 fqaeHF'])[2]")).click();
        Thread.sleep(2500);

        driver.findElement(By.xpath("(//*[.='Kids'])[6]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("(//*[@class='h-display-flex'])[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("(//*[@class='sc-gsTCUz jWgvIW'])[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("(//*[@class='OptionLabel-u6t284-0 cIvTbA h-text-md'])[7]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("(//*[@type='button'])[8]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("(//*[@class='sc-gqjmRU xqxqI'])[1]")).sendKeys("bakytkainazar@gmail.com");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1345678bk");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id='login']")).click();
        Thread.sleep(2500);
        driver.close();

    }
}
