package com.zapkiller.automation.config;

import com.zapkiller.automation.utils.UIAutomationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class Hooks {

    public static final Logger logger = LoggerFactory.getLogger(Hooks.class);

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before class....");
        UIAutomationUtils.readConfig();
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class....");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test....");
        UIAutomationUtils.launchBrowser();
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Befor method....");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite....");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class....");

    }

    @AfterTest
    public void afterTest(){
        UIAutomationUtils.closeBrowser();
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method....");
    }


}
