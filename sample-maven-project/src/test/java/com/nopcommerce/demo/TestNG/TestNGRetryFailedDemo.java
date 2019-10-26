package com.nopcommerce.demo.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class TestNGRetryFailedDemo {

    @Test
    public void test1(){
        System.out.println("I am in Test 1");
    }

    @Test
    public void test2(){
        System.out.println("I am in Test 2");
//        int i =1/0;
    }

    @Test(retryAnalyzer = com.nopcommerce.demo.TestNG.RetryAnalyzer.class)
    public void test3(){
        System.out.println("I am in Test 3");
        Assert.assertTrue(false);
    }

}
