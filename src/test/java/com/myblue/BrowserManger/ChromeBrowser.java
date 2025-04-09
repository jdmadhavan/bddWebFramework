package com.myblue.BrowserManger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements Browsers{

    @Override
    public WebDriver launchBrowser() {
        return new ChromeDriver();
    }

}
