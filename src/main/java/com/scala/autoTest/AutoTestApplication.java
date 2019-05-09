package com.scala.autoTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class AutoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoTestApplication.class, args);
		/*TestNG testNG = new TestNG();
		testNG.setTestClasses(new Class[] {PostApiTest.class});
		testNG.run();*/

		/*XmlSuite suite = new XmlSuite();
		suite.setName("TmpSuite");
		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.scala.autoTest.test"));
		test.setXmlClasses(classes) ;


		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();*/
/*
		TestNG testNG = new TestNG();
		List<String> suites = new ArrayList<String>();
		suites.add("res\\testNG.xml");//此处为xml的绝对路径
		testNG.setTestSuites(suites);
		testNG.run();*/
	}
}
