package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hower1 {
    /**
     * TC    #15:    Hover    Test
     * 1. Go    to    http://practice.cybertekschool.com/hovers
     * 2. Hover    over    to    first    image
     * 3. Assert:
     * a. “name:    user1”    is    displayed
     * 4. Hover    over    to    second    image
     * 5. Assert:
     * a. “name:    user2”    is    displayed
     * 6. Hover    over    to    third    image
     * 7. Confirm:
     * a. “name:    user3”    is    displayed
     */
    @Test
            public void setup() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//*[@alt='User Avatar'])[1]"))).perform();
        Driver.getDriver().findElement(By.xpath("(//*[@alt='User Avatar'])[1]")).isDisplayed();
        Thread.sleep(2000);

        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//*[@alt='User Avatar'])[2]"))).perform();
        Driver.getDriver().findElement(By.xpath("(//*[@alt='User Avatar'])[2]")).isDisplayed();

        Thread.sleep(2000);

        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//*[@alt='User Avatar'])[3]"))).perform();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//*[@alt='User Avatar'])[3]")).isDisplayed();













    }

}
