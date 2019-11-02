package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.resources.testdata.TestData;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani on 08/05/2019.
 */
public class LoginTestWithDataProvider extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage logInPage = new LoginPage();

    @Test(dataProvider="inputs", dataProviderClass= TestData.class)
    public void loginTest(String email, String password){
        homePage.clickOnLoginLink();
        logInPage.loginToApplication(email, password);
    }

}
