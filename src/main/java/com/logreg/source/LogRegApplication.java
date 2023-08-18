package com.logreg.source;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class LogRegApplication{

	public static void main(String[] args) {
		SpringApplication.run(LogRegApplication.class, args);
	}


}
