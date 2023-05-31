package com.example.CronTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CronTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronTaskApplication.class, args);
	}

}
