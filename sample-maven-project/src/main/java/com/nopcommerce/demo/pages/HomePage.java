package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class HomePage extends Util {


    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");

    public void clickOnRegisterLink(){
        log.info("Click on registrer link");
        clickOnElement(registerLink);
    }

    public void clickOnLoginLink(){
        log.info("Click on Login Link");
        clickOnElement(loginLink);
    }

}
