package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Cars {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // 1.Open browser
        // 2.Go to website: http://practice.cybertekschool.com/registration_form
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/registration_form");
    }

    @Test
    public void loginToSmartBear() {

        List<WebElement> inputs = driver.findElements(By.xpath("//input[@class='form-control']"));

        Faker faker = new Faker();

        for (int i = 0; i < inputs.size(); i++) {

            if (i == 0) {
                // 3.Enter first name
                String fakerFirstName = faker.name().firstName();
                inputs.get(i).sendKeys(fakerFirstName);
            } else if (i == 1) {
                // 4.Enter last name
                String fakerLastName = faker.name().lastName();
                inputs.get(i).sendKeys(fakerLastName);
            } else if (i == 2) {
                // 5.Enter username
                String fakerUserName1 = faker.name().firstName();
                String fakerUserName2 = faker.number().digits(4);
                String fakerUserName = fakerUserName1 + fakerUserName2;
                inputs.get(i).sendKeys(fakerUserName);
            } else if (i == 3) {
                // 6.Enter email address
                String fakerEmail = faker.internet().emailAddress();
                inputs.get(i).sendKeys(fakerEmail);
            } else if (i == 4) {
                // 7.Enter password
                String fakerPassword = faker.internet().password();
                inputs.get(i).sendKeys(fakerPassword);
            } else if (i == 5) {
                // 8.Enter phone number
                String fakerPhoneNumber = faker.number().digits(10);
                String fakerPhoneNumberCorrect = fakerPhoneNumber.substring(1, 4) + "-" + fakerPhoneNumber.substring(3, 6) + "-" + fakerPhoneNumber.substring(6);
                inputs.get(i).sendKeys(fakerPhoneNumberCorrect);
            } else if (i == 6) {
                // 10.Enter date of birth
                int fakerDay = faker.number().numberBetween(1, 31);
                int fakerMonth = faker.number().numberBetween(1, 12);
                int fakerYear = faker.number().numberBetween(1940, 2015);
                String fakerDateOfBirth = fakerMonth + "/" + fakerDay + "/" + fakerYear;
                inputs.get(i).sendKeys(fakerDateOfBirth);
            }
        }

        // 9.Select a gender from radio buttons
        WebElement gender = driver.findElement(By.xpath("//input[@value='female']"));
        gender.click();

////         11.Select Department/Office
////         12.Select Job Title
////         13.Select programming language from checkboxes
////         14.Click to sign up button
////         15. Verify success message “You’ve successfully completed registration.”is displayed.


    }
}


