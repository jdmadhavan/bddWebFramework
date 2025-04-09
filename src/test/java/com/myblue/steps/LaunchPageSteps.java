package com.myblue.steps;


import com.myblue.webDriver.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Logger;

public class LaunchPageSteps {

    Logger logger=Logger.getLogger(String.valueOf(LaunchPageSteps.class));
    WebDriver driver;

    @Given("Verify home page is displaying")
    public void launchApplication() {
        WebDriverManager wb = new WebDriverManager();
        driver = wb.createWebdriver();
        WebElement element = driver.findElement(By.xpath("//h5[text()='Login']"));
        element.isDisplayed();

    }


    @After
    public void tearDown(Scenario scenario) {
        driver.quit();
        logger.info(scenario.getName()+" Scenario execution completed");
        logger.info("Browser closed Successfully");
    }
}
