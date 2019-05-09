package com.scala.autoTest;

import com.scala.autoTest.base.TestBase;
import com.scala.autoTest.util.RestClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.testng.Reporter;

public class extentReport {
    String host;
    String url;
    RestClient restClient;
    TestBase testBase;
      @Scheduled(initialDelay = 1000, fixedDelay = 1000)
    public void test1(){
        System.out.println("extentReport----->test1");
    }


    @Scheduled(initialDelay = 1000, fixedDelay = 1000)
    public void test2(){
        System.out.println("extentReport----->test2");
    }

    @Scheduled(initialDelay = 1000, fixedDelay = 1000)
    public void test3(){
        Reporter.log("betterman写的日志----->test3");
        System.out.println("extentReport----->test3");
        throw new RuntimeException("extentReport----->betterman的异常test3");
    }
}
