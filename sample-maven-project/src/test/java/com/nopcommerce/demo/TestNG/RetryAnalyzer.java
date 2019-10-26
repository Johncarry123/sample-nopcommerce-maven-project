package com.nopcommerce.demo.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Jay
 */
public class RetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }


}
