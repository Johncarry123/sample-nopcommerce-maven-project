package com.nopcommerce.demo.TestNG;

import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class TestNG_Priority {

    @Test(priority = 1)
    public void testMethod1() {
        System.out.println("TestNG_Priority -> testMethod1");
    }

    @Test()
    public void atestMethod2() {
        System.out.println("TestNG_Priority -> testMethod2");
    }

    @Test(priority = 0)
    public void testMethod3() {
        System.out.println("TestNG_Priority -> testMethod3");
    }
}
