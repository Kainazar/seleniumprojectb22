package com.cybertek.tests.day10_webtable_properties;

import com.cybertek.tests.base.TestBase;
import com.cybertek.tests.utilities.ConfigurationReader;
import com.cybertek.tests.utilities.TableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Table_Tasks extends TestBase {



    @Test
    public void task3_return_tims_due_amount(){
        String url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);
        //1.	Open browser and go to: http://practice.cybertekschool.com/tables#edit
        //2.	Locate first table and verify Tim has due amount of “$50”
        //
        //Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.

        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));
        System.out.println("timsDueAmountCell. = " + timsDueAmountCell.getText());

        String actualTimeResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";

        Assert.assertEquals(actualTimeResult,expectedTimResult, "Tim cell is not returning as expected");

        //Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.


    }

    @Test
    public void task4_verify_order_method () {

        TableUtils.verifyOrder(driver, "Tim");


    }

}
