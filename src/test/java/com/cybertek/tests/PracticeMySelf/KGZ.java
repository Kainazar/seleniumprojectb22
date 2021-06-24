package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.utilities.BrowserUtils;
import com.cybertek.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KGZ {
    @Test
    public void search_box() {


        Driver.getDriver().get("https://www.wikipedia.org/");
        WebElement searchInput = Driver.getDriver().findElement(By.xpath("//input[@id='searchInput']"));
        searchInput.sendKeys("List of countries and territories");
        BrowserUtils.sleep(5);

        WebElement searchIcon = Driver.getDriver().findElement(By.xpath("//i[@class='sprite svg-search-icon']"));
        searchIcon.click();
        BrowserUtils.sleep(3);

        Actions at = new Actions(Driver.getDriver());
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        BrowserUtils.sleep(3);

        WebElement l = Driver.getDriver().findElement(By.linkText("List of countries by name"));
        l.click();
        BrowserUtils.sleep(3);

        Actions a = new Actions(Driver.getDriver());
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        BrowserUtils.sleep(3);
        WebElement k = Driver.getDriver().findElement(By.linkText("Kyrgyzstan"));
        k.click();

        Actions b = new Actions(Driver.getDriver());
        b.sendKeys(Keys.PAGE_DOWN).build().perform();
        BrowserUtils.sleep(3);

        WebElement d = Driver.getDriver().findElement(By.linkText("Population"));
        d.click();
        BrowserUtils.sleep(3);

        WebElement s = Driver.getDriver().findElement(By.className("infobox-data"));
        BrowserUtils.sleep(3);

        String expectedHeader = "infobox-data";
        String actualHeaderText = s.getText();

        System.out.println(expectedHeader);
        System.out.println(actualHeaderText);
    }
}
