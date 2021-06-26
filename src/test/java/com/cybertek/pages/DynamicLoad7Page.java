package com.cybertek.pages;

import com.cybertek.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad7Page {
    public DynamicLoad7Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement alert;

    @FindBy(xpath = "//img[@class='rounded mx-auto d-block']")
    public WebElement picture;

}
