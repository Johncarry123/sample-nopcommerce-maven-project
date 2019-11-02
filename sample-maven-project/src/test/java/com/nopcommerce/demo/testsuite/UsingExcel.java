package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.excelutility.ExcelUtility;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani on 15/05/2019.
 */
public class UsingExcel extends TestBase {
    public static final String File_Path = System.getProperty("user.dir")+"\\src\\test\\java\\com\\nopcommerce\\demo\\resources\\testdata\\ExcelData.xlsx";

    @BeforeClass
    public void setExcel(){
        // Tell the code about the location of Excel file
        try {
            ExcelUtility.setExcelFile(File_Path, "LoginTests");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "loginData")
    public Object[][] dataProvider() {
        Object[][] testData = ExcelUtility.getTestData("Invalid_Login");
        return testData;
    }

    @Test(dataProvider="loginData")
    public void testUsingExcel(String email, String password)  {
        new HomePage().clickOnLoginLink();
        new LoginPage().loginToApplication(email, password);
    }

}
