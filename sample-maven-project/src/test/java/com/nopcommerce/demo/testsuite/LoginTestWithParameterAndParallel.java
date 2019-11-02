package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.browserselector.BrowserSelector;
import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay Vaghani
 */
public class LoginTestWithParameterAndParallel extends BasePage {

    HomePage homePage = new HomePage();
    LoginPage logInPage = new LoginPage();
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperties = new LoadProperty();

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser){
        browserSelector.selectBrowser(browser);
        driver.get(loadProperties.getProperty("baseUrl"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void loginTest() throws InterruptedException {
        homePage.clickOnLoginLink();
        logInPage.enterEmail("abc@gmail.com");
        logInPage.enterPassword("abc123");
        logInPage.clickOnLoginButton();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
