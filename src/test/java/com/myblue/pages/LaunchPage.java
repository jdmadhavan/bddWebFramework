package com.myblue.pages;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class LaunchPage extends BasePage{

    public LaunchPage(WebDriver driver, Scenario scenario)
    {
        this.driver=driver;
    }
    public void openApplication() {
        System.out.println("Application Started");
    }
}
