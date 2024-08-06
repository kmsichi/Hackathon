package com.example.hackathonBoardTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HackathonBoardTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(HackathonBoardTestApplication.class, args);
	}

}
