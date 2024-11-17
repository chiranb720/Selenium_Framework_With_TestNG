package com.zapkiller.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UIAutomationUtils {

    public static final Logger logger = LoggerFactory.getLogger(UIAutomationUtils.class);
    public static WebDriver driver;
    public static ChromeOptions options = new ChromeOptions();

    /**
     * <p>Reads Properties /Config file and its properties</p>
     * @return Property
     * @version 1.0
     */
    public static Properties readConfig(){
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config-qa.properties");
            Properties config = new Properties();
            config.load(fis);
            return config;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * <p>This method launches the browser mentioned in the property file</p>
     * @verion 1.0
     */

    public static void launchBrowser(){
        if(readConfig().getProperty("browser").equalsIgnoreCase("chrome")){
            System.out.println("Browser Launched");
            if(readConfig().getProperty("browser.chrome.options.headless").equalsIgnoreCase("true")){
                options.addArguments("--headless");
            }
            System.out.println("Browser Launched");
            driver = new ChromeDriver(options);
        }
    }

    /**
     * <p>This method closes the browser</p>
     * @version 1.0
     */
    public static void closeBrowser(){
        driver.close();
    }

    /**
     * <p>This method is used to navigate to current URL</p>
     * @version 1.0
     */

    public void navigateToUrl(String url){
        driver.get(url);
    }


    /**
     * <p>This method is used to click element</p>
     * @param element
     */
    public void clickElement(By element){
        driver.findElement(element).click();
    }

}
