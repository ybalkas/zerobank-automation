package com.bitrix.stepDefinations;

import com.bitrix.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("---- Starting a new Task ----");
    }

    @After
    public void finito(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenShot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

}
