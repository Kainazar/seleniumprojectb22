package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import com.cybertek.tests.utilities.BrowserUtils;
import com.cybertek.tests.utilities.ConfigurationReader;
import com.cybertek.tests.utilities.OfficeHoursUtils1;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FinArtz {
    WebDriver driver;
    String browser = ConfigurationReader.getProperty("browser");
    String addUserUrl = ConfigurationReader.getProperty("finArtzAddUserUrl");
    String loginUrl = ConfigurationReader.getProperty("finArtzLoginUrl");

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver(browser);
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void loginTest() throws InterruptedException {
        // Adding user test
        OfficeHoursUtils1.addUserTest(driver, addUserUrl);
        BrowserUtils.sleep(3);
        // Positive Login Test
        Assert.assertTrue(OfficeHoursUtils1.positiveLoginTest(driver,loginUrl));


    }
    @AfterMethod
    public void tearDown () {
        BrowserUtils.sleep(3);
         driver.close();
    }
}
