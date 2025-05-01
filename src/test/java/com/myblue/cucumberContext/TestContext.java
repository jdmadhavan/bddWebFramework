package com.myblue.cucumberContext;

import com.myblue.pageFactory.PageObjectManger;
import com.myblue.webDriver.WebDriverManager;

public class TestContext {

    private WebDriverManager webDriverManager;
    private PageObjectManger pageObjectManger;

    public TestContext()
    {
        webDriverManager=new WebDriverManager();
    }

}
