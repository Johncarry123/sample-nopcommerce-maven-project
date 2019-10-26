package com.nopcommerce.demo.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class TestNG_DependentTests {
    SomeClassToTest obj;


    @Test(dependsOnMethods={ "testMethod2"})
    public void testMethod1() {
        Assert.assertTrue(false);
    }

    @Test
    public void testMethod2() {
        System.out.println("testMethod2");
//        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods={ "testMethod1","" })
    public void testMethod3() {
        System.out.println("testMethod3");
    }

    @Test
    public void testMethod4() {
        System.out.println("testMethod4");
    }
}
