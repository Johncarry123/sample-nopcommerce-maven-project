package com.nopcommerce.demo.testsuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.nopcommerce.demo.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class ExtentReportDemo extends BasePage {


    String projectPath = System.getProperty("user.dir");

    public ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter(projectPath+"/Reports/myReport.html");

    public ExtentReports extent;
    public ExtentTest test;

    @BeforeTest
    public void setExtent(){
        htmlReporter.config().setDocumentTitle("Automation Report"); // Title of the Report
        htmlReporter.config().setReportName("Functional Report"); // Name of the report
        htmlReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();

        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("HostName", "LocalHost");
        extent.setSystemInfo("OS", "Windows10");
        extent.setSystemInfo("Tester Name", "Jay");
        extent.setSystemInfo("Browser", "Chrome");
    }


    @AfterTest
    public void endReport(){
        extent.flush();
    }

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void nopCommerceTitleTest(){
        test = extent.createTest("nopCommerceTitleTest");

        String title =driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "noCommerce demo store");
    }

    @Test
    public void nopCommerceLogoTest(){
        test = extent.createTest("nopCommerceLogoTest");
        Boolean status = driver.findElement(By.xpath("//div[@class='header-logo']//a//img")).isDisplayed();
        Assert.assertTrue(status);
    }

    @Test
    public void nopCommerceLoginTest(){
        test = extent.createTest("nopCommerceLoginTest");
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE){
            test.log(Status.FAIL, "TEST CASE FAILED IS "+ result.getName()); // to add name in extent report
            test.log(Status.FAIL, "TEST CASE FAILED IS "+ result.getThrowable()); // to add error/exception in extent report
            String screenshotPath = ExtentReportDemo.getScreenshot(driver, result.getName());
            test.addScreenCaptureFromPath(screenshotPath); // adding screenshot to report
            System.out.println(screenshotPath);



        }else if (result.getStatus() == ITestResult.SKIP){
            test.log(Status.SKIP, "Test Case SKIPPED IS " +result.getName());
        }else if (result.getStatus() == ITestResult.SUCCESS){
            test.log(Status.PASS, "Test Case PASSED IS " +result.getName());
        }
        driver.close();
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // after execution, you could see a folder "FailedTestsScreenshots" under src folder
        String destination = System.getProperty("user.dir") + "\\ErrorScreenshots\\" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }

}
