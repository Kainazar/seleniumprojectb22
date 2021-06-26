package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.tests.utilities.ConfigurationReader;
import com.cybertek.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TS1 {
   /**
    *  Then : I on login page I should able to login at https://qa3.vytrack.com/user/login.
    *  When : I am able to write user name.
    *  And  : I am able to write password.
    *  Then : I can click Login IN button.
    *  When : I However over  to “FLEET”  I should be able see “Vechile” click it.
    *   And :  I see on left side “Export Grid “ dropdown. Click it.
    */

   @Test
    public void setup() throws InterruptedException {
       Driver.getDriver().get("https://qa3.vytrack.com/user/login");
       WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
       Thread.sleep(1000);
       userName.sendKeys(ConfigurationReader.getProperty("userName1"));

       WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
       Thread.sleep(1000);
       password.sendKeys(ConfigurationReader.getProperty("password"));

       WebElement loginBtn = Driver.getDriver().findElement(By.id("_submit"));
       loginBtn.click();

       WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
       fleet.click();

       WebElement vehicle = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
       Thread.sleep(2000);
       vehicle.click();

       WebElement exportGrid = Driver.getDriver().findElement(By.xpath("//div[@class='pull-left grid-toolbar-mass-actions']"));
       Thread.sleep(2000);
       exportGrid.click();

       Assert.assertTrue(exportGrid.isDisplayed());
       System.out.println("Export Grid is clickable "+exportGrid.isEnabled());




      }
    @Test
   public void check_pages(){
      List<WebElement> pages = Driver.getDriver().findElements(By.xpath("//*[@class='fa-chevron-right hide-text']"));
       for (int i = 1; i <pages.size() ; i++) {
          System.out.println(pages.size());



       }

       }

       }





