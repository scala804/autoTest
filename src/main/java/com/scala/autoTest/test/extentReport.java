package com.scala.autoTest.test;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class extentReport {
    @Test
    public void test1(){
        System.out.println("extentReport----->test1");
    }
    @Test
    public void test2(){
        System.out.println("extentReport----->test2");
    }
    @Test
    public void test3(){
        Reporter.log("betterman写的日志----->test3");
        System.out.println("extentReport----->test3");
        throw new RuntimeException("extentReport----->betterman的异常test3");
    }
}
