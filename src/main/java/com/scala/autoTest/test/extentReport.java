package com.scala.autoTest.test;

import com.scala.autoTest.base.TestBase;
import com.scala.autoTest.restClient.RestClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.testng.Reporter;
import org.testng.annotations.Test;
/*@Component*/
public class extentReport {

    /*@Scheduled(initialDelay = 1000, fixedDelay = 1000)*/
    public void test1(){
        System.out.println("extentReport----->test1");
    }


    /*@Scheduled(initialDelay = 1000, fixedDelay = 1000)*/
    public void test2(){
        System.out.println("extentReport----->test2");
    }

    /*@Scheduled(initialDelay = 1000, fixedDelay = 1000)*/
    public void test3(){
        Reporter.log("betterman写的日志----->test3");
        System.out.println("extentReport----->test3");
        throw new RuntimeException("extentReport----->betterman的异常test3");
    }
}
