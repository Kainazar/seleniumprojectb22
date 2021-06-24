package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import com.cybertek.tests.utilities.BrowserUtils;
import com.cybertek.tests.utilities.ConfigurationReader;
import com.cybertek.tests.utilities.LibraryUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Library_Login {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //    1. Open browser
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //    2. Go to website: http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");
    }

@Test
        public void login_link_count_test(){
//     loginMethod calling to login Library app
       LibraryUtils.loginLibrary(driver);

//    6. Print out count of all the links on landing page
      BrowserUtils.sleep(3);
      List <WebElement> allLinks=   driver.findElements(By.xpath("//body//a"));
     System.out.println("allLinks = " + allLinks.size());

//    7. Print out each link text on this page
        for (WebElement eachLink : allLinks) {
        System.out.println(eachLink.getText());
    }

//    username password
//    student11@library                   tScBPCUr
//    student12@library                  UC0LC9Hj
//    student13@library                   zcVbvUWH
//    librarian13@library                  9rf6axdD



    }

}

