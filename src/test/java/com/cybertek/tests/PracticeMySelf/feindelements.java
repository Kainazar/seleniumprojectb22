package com.cybertek.tests.PracticeMySelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feindelements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com//");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@href='/login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='login_field']")).sendKeys("bakyt.kainazar@gmail.com"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Erkin2010$"+Keys.ENTER);
       // driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='details-overlay details-reset js-header-promo-toggle']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@href='/new/project']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name='project[name]']")).sendKeys("TodayClass05_18_21");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='project_body']")).sendKeys("Practice For Today");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='project_public_true']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn btn-primary flex-auto float-none float-md-left']")).click();
driver.findElement(By.xpath("//*[@class='js-project-dialog-button btn btn-primary']")).click();
        driver.findElement(By.xpath("//*[@id='project-column-name-']")).sendKeys("CybertekB22"+Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class='btn-link Link--primary project-header-link v-align-middle no-underline no-wrap js-show-project-menu d-flex flex-items-center']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn-link btn-octicon']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/main/div[4]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/details/details-menu/ul/li[1]/button")).click();
        driver.findElement(By.xpath("//*[@class='btn btn-primary flex-auto float-sm-left']")).click();

        Thread.sleep(10000);
        driver.close();





    }


}
