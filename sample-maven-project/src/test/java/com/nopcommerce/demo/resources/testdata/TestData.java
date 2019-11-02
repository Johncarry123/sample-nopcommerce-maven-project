package com.nopcommerce.demo.resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay Vaghani on 08/05/2019.
 */
public class TestData {

    @DataProvider(name = "inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"test1@gmail.com", "test123"},
                {"test2@gmai1.com", "test234"},
                {"test3@gmail.com", "test345"},
                {"test4@gmail.com", "test345"}
        };
    }
}
