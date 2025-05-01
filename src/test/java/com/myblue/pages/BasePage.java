package com.myblue.pages;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class BasePage {
    public Scenario scenario;
    WebDriver driver;


    public void takeSnap(Scenario scenario) throws IOException {

        System.out.println("inside screenshot");
        final byte[] screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "snap");

    }

    public void quitBrowser() {
        driver.quit();

    }

}
