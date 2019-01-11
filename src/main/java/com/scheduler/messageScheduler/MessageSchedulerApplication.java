package com.scheduler.messageScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MessageSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageSchedulerApplication.class, args);
	}

}

