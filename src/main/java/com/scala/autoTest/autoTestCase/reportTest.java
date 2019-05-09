package com.scala.autoTest.autoTestCase;

import org.testng.annotations.*;

public class reportTest {

    public class BasicAnnotationStudy {
        @Test
        /*@Scheduled(initialDelay = 1000, fixedDelay = 1000)*/
        public void testcase1() {
            System.out.println("测试用例1");
        }

        @Test
        public void testcase2() {
            System.out.println("测试用例2");
        }

        @BeforeMethod
        public void BeforeMethod() {
            System.out.println("BeforeMethod测试方法之前运行");
        }

        @AfterMethod
        public void AfterMethod() {
            System.out.println("BeforeMethod测试方法之后运行");
        }

        @AfterClass
        public void AfterClass() {
            System.out.println("AfterClass在类运行之前运行");
        }

        @BeforeClass
        public void BeforeClass() {
            System.out.println("BeforeClass在类运行之后运行");
        }

        @BeforeTest
        public void BeforeTest() {
            System.out.println("BeforeTest运行");
        }

        @AfterTest
        public void AfterTest() {
            System.out.println("AfterTest运行");
        }

        @BeforeSuite
        public void BeforeSuite() {
            System.out.println("BeforeSuite运行了");
        }

        @AfterSuite
        public void AfterSuite() {
            System.out.println("AfterSuite运行了");
        }
    }
}