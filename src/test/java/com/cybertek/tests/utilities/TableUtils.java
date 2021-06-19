package com.cybertek.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TableUtils {

//    PRACTICE #4: Method: verifyOrder
//            • Create a method named verifyOrder in TableUtils class.
//            • Method takes WebDriver object and String(name).
//            • Method should verify if given name exists in orders.
//            • This method should simply accepts a name(String), and assert whether
//             given name is in the list or not.
//            • Create a new TestNG test to test if the method is working as expected.

public static void verifyOrder(WebDriver driver, String name) {

        List<WebElement> allName = driver.findElements(By.xpath("//table [@id = 'table1']//tr/td[2]"));
        // List<WebElement> elements = driver.findElements(By.xpath("//table [@id = 'table1']//tr/td[2]"));  short cut option +enter

        for (WebElement eachNames : allName) {
        //System.out.println(eachNames.getText());

        if (eachNames.getText().equals(name)) {

            Assert.assertTrue(true);
                 return;
            }
        }
    Assert.assertTrue(false, "Name does not exist in the list.");
     }


}

