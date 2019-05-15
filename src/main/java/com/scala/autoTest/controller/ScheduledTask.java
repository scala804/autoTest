package com.scala.autoTest.controller;

import com.scala.autoTest.AutoTestApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

@Component
public class ScheduledTask {
    /*@Scheduled(cron = "0 0/5 15 * * ?")*/
   @Scheduled(cron = "0/30 * * * * ?")
    public  void  testTask(){
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add("res\\testNG.xml");
        testNG.setTestSuites(suites);
        testNG.run();
    }
}
