package com.nopcommerce.demo.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

/**
 * Created by Jay
 */
public class BasePage {

    public static WebDriver driver;

    public BasePage(){
        PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\java\\com\\nopcommerce\\demo\\resources\\propertiesfile\\log4j.properties");
    }
}
