package com.cybertek.tests.PracticeMySelf;

import com.cybertek.pages.VyTrackLoginPage;
import com.cybertek.tests.utilities.Driver;
import org.testng.annotations.Test;

public class VyTrackLogin {

    @Test
    public void login_page(){
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        VyTrackLoginPage login = new VyTrackLoginPage();
        login.inputEmail.sendKeys("salesmanager270");
        login.inputPassword.sendKeys("UserUser123");
        login.loginBtn.click();


    }

}
