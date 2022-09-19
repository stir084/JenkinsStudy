package com.loose.JenkinsStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JenkinsStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsStudyApplication.class, args);
	}

}
