package com.cybertek.pages;

import com.cybertek.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "prependedInput")
    public WebElement inputEmail;

    @FindBy (id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy (id = "_submit")
    public WebElement loginBtn;

    @FindBy (xpath = "//div[.='Invalid user name or password.']")
    public WebElement invalidEmailFormatError;


}
