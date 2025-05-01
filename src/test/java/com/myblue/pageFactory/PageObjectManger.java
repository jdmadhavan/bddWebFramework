package com.myblue.pageFactory;

import com.myblue.pages.LaunchPage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class PageObjectManger {

    private WebDriver driver;
    private Scenario scenario;
    private LaunchPage launchPage;

     public PageObjectManger(WebDriver driver)
     {
         this.driver=driver;
     }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public LaunchPage getLaunchPage() {
         return (launchPage==null) ? launchPage=new LaunchPage(driver,scenario):launchPage;

    }

}


