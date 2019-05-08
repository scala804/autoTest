package com.scala.autoTest.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

@Component
public class ScheduledTask {
    @Scheduled(cron = "0 0/5 15 * * ?")
    public  void  testTask(){
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add("res\\testNG.xml");//此处为xml的绝对路径
        testNG.setTestSuites(suites);
        testNG.run();
    }
}
