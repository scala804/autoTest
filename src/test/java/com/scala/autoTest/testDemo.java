package com.scala.autoTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testDemo{

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "fast" })
    public void aFastTest() {
       /* System.out.println("Fast test");*/
        System.out.println(System.getProperty("user.dir"));
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
    }
}