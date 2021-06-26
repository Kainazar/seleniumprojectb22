package com.cybertek.pages;

import com.cybertek.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dynamic_Load_Page1 {
    public Dynamic_Load_Page1(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[text()='Start']")
    public WebElement startBtn;

    @FindBy (id = "loading")
    public WebElement loadingBar;

    @FindBy (id = "username")
    public  WebElement username;

    @FindBy (id = "pwd")
    public  WebElement password;

    @FindBy(id = "flash")
    public WebElement errorMessage;

    @FindBy (xpath ="//button[@type='submit']")
    public WebElement submitBtn;

}
