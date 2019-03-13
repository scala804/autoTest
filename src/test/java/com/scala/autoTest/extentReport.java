package com.scala.autoTest;

import com.scala.autoTest.base.TestBase;
import com.scala.autoTest.restClient.RestClient;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class extentReport {
    String host;
    String url;
    RestClient restClient;
    TestBase testBase;
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
