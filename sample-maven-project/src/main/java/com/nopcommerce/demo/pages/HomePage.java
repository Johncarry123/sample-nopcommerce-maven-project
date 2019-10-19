package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class HomePage extends Util {

    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

}
