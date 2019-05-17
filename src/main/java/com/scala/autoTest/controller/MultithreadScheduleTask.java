package com.scala.autoTest.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.testng.TestNG;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//@Component注解用于对那些比较中立的类进行注释；
//相对与在持久层、业务层和控制层分别采用 @Repository、@Service 和 @Controller 对分层中的类进行注释
@Component
@EnableScheduling   // 1.开启定时任务
@EnableAsync        // 2.开启多线程
public class MultithreadScheduleTask {
/*
    @Async
    @Scheduled(fixedDelay = 6000)
    public void testSix()throws InterruptedException {
        getTestNGXML("res\\testNG.xml");
        System.out.println("第二个定时任务开始 : " + LocalDateTime.now().toLocalTime() + "\r\n线程 : " + Thread.currentThread().getName());
        System.out.println();
    }
    @Async
    @Scheduled(fixedDelay = 12000)
    public void testSixOne()throws InterruptedException {
        getTestNGXML("res\\test01NG.xml");
    }
    public void getTestNGXML(String testNgPath){
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add(testNgPath);
        testNG.setTestSuites(suites);
        testNG.run();
    }*/
}