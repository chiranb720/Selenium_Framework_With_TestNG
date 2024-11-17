package com.zapkiller.automation.testcases;

import com.zapkiller.automation.config.Hooks;
import com.zapkiller.automation.pages.HomePage;
import com.zapkiller.automation.utils.UIAutomationUtils;
import org.testng.annotations.Test;


public class DemoTest extends Hooks {



    @Test
    public void register_new_user_test() {
        System.out.println(UIAutomationUtils.readConfig().getProperty("browser"));
        HomePage homePage = new HomePage();
        homePage.navigateToUrl("http://vistacommerce-qa.rf.gd/");
        homePage.clickElement(homePage.signInLink);
        UIAutomationUtils.launchBrowser();
        UIAutomationUtils.closeBrowser();
    }
}
