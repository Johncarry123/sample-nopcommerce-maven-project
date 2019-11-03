package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class LoginPage extends Util {


    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@value='Log in']");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public void enterEmail(String email){
        log.info("Enter email");
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        log.info("Enter password");
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        log.info("Click on login button");
        clickOnElement(loginBtn);
    }

    public String welcomeText(){
        log.info("Getting Welcome text");
       return getTextFromElement(welcomeText);
    }

    public void loginToApplication(String email, String password){
        enterEmail(email);
        enterPassword(password);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnLoginButton();
    }
}
