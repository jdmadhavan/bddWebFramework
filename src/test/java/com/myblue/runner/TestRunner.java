package com.myblue.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./src/test/resources/features"},
                 glue={"com.myblue.steps"},
                 tags="",
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"// HTML report
                 },
        monochrome = true,
        dryRun = false)
public class TestRunner {
}
