package com.demo.batch.integration;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@SpringBootApplication
@EnableBatchProcessing
public class TestForJenkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestForJenkinApplication.class, args);
	}

}
