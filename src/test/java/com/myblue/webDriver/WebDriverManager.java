package com.myblue.webDriver;

import com.myblue.BrowserManger.ChromeBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Logger;

import static com.myblue.BrowserManger.BrowserType.CHROME;

public class WebDriverManager {
    public  WebDriver driver;
    Logger logger = Logger.getLogger(String.valueOf(WebDriverManager.class.getName()));

    public WebDriver getDriver() {
        if (driver == null)
            driver = createWebdriver();
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    public  WebDriver createWebdriver()
    {

        String browserName="chrome";
        String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        switch (browserName)
        {
            case "chrome":
                logger.info("Local Chrome Browser is launching");
                driver= new ChromeBrowser().launchBrowser();
                driver.manage().window().maximize();
                driver.get(url);
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
              return driver;
        }

        return null;
    }
}
