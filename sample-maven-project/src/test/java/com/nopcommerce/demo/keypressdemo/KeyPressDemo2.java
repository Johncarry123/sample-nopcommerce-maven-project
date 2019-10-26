package com.nopcommerce.demo.keypressdemo;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.browserselector.BrowserSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class KeyPressDemo2 extends BasePage {


    @BeforeMethod
    public void setUp() throws Exception {
        new BrowserSelector().selectBrowser("chrome");
    }

    @Test
    public void testKeyPress() throws Exception {
        driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
        Thread.sleep(2000);
//        driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
//        Thread.sleep(2000);
//        String selectAll = Keys.chord(Keys.CONTROL, "a");
//        driver.findElement(By.id("openwindow")).sendKeys(selectAll);
//        Thread.sleep(4000);
    }

    @AfterMethod
    public void tearDown() throws Exception {
//        driver.quit();
    }
}

