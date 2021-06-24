package com.cybertek.tests.PracticeMySelf;

import com.cybertek.tests.utilities.Driver;
import org.testng.annotations.Test;

public class Guru {
    @Test
    public void setup(){
        Driver.getDriver().get("https://demo.guru99.com/v4/");

    }

}
