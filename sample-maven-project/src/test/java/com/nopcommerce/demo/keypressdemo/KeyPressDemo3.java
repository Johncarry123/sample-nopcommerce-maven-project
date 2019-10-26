package com.nopcommerce.demo.keypressdemo;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.browserselector.BrowserSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class KeyPressDemo3 extends BasePage {
    private String baseUrl;

    @BeforeMethod
    public void setUp() throws Exception {
        new BrowserSelector().selectBrowser("chrome");
    }

    @Test
    public void testKeyPress() throws Exception {
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }

}
