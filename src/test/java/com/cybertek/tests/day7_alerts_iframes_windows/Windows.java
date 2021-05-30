package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Windows {
    WebDriver driver;

    @BeforeClass
    public void setupClass() {

        driver = WebDriverFactory.getDriver("chrome");
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }
    @Test
    public void
}
