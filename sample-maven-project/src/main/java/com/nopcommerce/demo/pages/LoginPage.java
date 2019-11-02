package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class LoginPage extends Util {

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@value='Log in']");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public void enterEmail(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginBtn);
    }

    public String welcomeText(){
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
