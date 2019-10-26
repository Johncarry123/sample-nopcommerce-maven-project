package com.nopcommerce.demo.TestNG;

import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class TestNG_Grouping {


    @Test(groups = {"smoke", "sanity"})
    public void loginTest1() {
        System.out.println("Running Test - loginTest1");
    }

    @Test(groups = {"regression"})
    public void loginTest2() {
        System.out.println("Running Test - loginTest2");
    }

    @Test(groups = {"smoke", "sanity"})
    public void registrationTest1() {
        System.out.println("Running Test - registrationTest1");
    }

    @Test(groups = {"regression"})
    public void registrationTest2() {
        System.out.println("Running Test - registrationTest2");
    }

    @Test(groups = {"smoke", "sanity"})
    public void computerTest1() {
        System.out.println("Running Test - computerTest1");
    }

    @Test(groups = {"regression", "sanity"})
    public void computerTest2() {
        System.out.println("Running Test - computerTest2");
    }

    @Test(groups = {"linux.regression"})
    public void computerTest3() {
        System.out.println("Running Test - computerTest3");
    }

    @Test(groups = {"windows.regression"})
    public void computerTest5() {
        System.out.println("Running Test - computerTest3");
    }
}
