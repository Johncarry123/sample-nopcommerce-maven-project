package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.browserselector.BrowserSelector;
import com.nopcommerce.demo.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Jay
 */
public class TestBase extends BasePage {

    String browser = new LoadProperty().getProperty("browser");

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();;
    }

}
