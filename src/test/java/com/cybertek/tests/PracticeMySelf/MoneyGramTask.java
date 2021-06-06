package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class MoneyGramTask {

    @Test
    public void Task1 () {
        /**
         * REAL JOB INTERVIEW TASK
         *         1. Navigate to: https://moneygaming.qa.gameaccount.com/
         *         2. Click the JOIN NOW button to open the registration page
         *         3. Select a title value from the dropdown
         *         4. Enter your first name and surname in the form
         *         5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
         *         6. Submit the form by clicking the JOIN NOW button
         *         7. Validate that a validation message with text ‘ This field is required’ appears under the date of
         *         birth box
         */
     //   WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com");
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@class='newUser green']")).click();
        Select select = new Select(driver.findElement(By.xpath("//*[@class='title required']")));
        select.selectByVisibleText("Mr");

        String expectedTitle= "Mr";
        String actualTitle = select.getFirstSelectedOption().getText();
        if (expectedTitle.contains(actualTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.findElement(By.id("forename")).sendKeys("Bt");
        driver.findElement(By.xpath("//*[@name='map(lastName)']")).sendKeys("KB");
        driver.findElement(By.xpath("(//*[@id='checkbox'])[3]")).click();
        driver.findElement(By.id("form")).click();

        Select data = new Select (driver.findElement(By.id("dobDay")));
        data.selectByVisibleText("26");

        Select month = new Select (driver.findElement(By.id("dobMonth")));
        month.selectByVisibleText("January");

        Select year = new Select (driver.findElement(By.id("dobYear")));
        year.selectByVisibleText("1990");

        String expectedError = "This field is required";
        String actualError = driver.findElement(By.xpath("(//*[@class='error'])[2]")).getText();
        if (actualError.contains(expectedError)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }






    }
}
