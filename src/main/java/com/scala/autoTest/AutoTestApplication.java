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
	}
}
