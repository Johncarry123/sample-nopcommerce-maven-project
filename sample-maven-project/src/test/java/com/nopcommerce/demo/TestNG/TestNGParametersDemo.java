package com.nopcommerce.demo.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class TestNGParametersDemo {

    @Test
    @Parameters("MyName")
    public void test(@Optional("Jay") String name){
        System.out.println("Name is : "+name);
    }

}
