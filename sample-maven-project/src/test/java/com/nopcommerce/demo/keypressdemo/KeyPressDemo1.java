package com.nopcommerce.demo.keypressdemo;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.browserselector.BrowserSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class KeyPressDemo1 extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    private String baseUrl;

    @BeforeMethod
    public void setUp() {
        browserSelector.selectBrowser("Chrome");
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        driver.get(baseUrl);
        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testKeyPress() throws Exception {
        driver.findElement(By.xpath("//a[contains(@href,'sign_in')]")).click();
        driver.findElement(By.id("user_email")).sendKeys("test@email.com");
        Thread.sleep(2000);
        driver.findElement(By.id("user_email")).sendKeys(Keys.TAB);
        driver.findElement(By.id("user_password")).sendKeys("123123");
        Thread.sleep(2000);
        driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        // driver.quit();
    }

}
