package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public  void userShouldNavigateToLogInPageSuccessfully(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(loginPage.welcomeText(), expectedText);
    }

    @Test
    public void userShouldLoginSuccessfully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        loginPage.clickOnLoginButton();
    }
}
