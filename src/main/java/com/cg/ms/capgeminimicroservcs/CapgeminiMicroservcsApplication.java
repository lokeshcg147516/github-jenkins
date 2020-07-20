package com.cg.ms.capgeminimicroservcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CapgeminiMicroservcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapgeminiMicroservcsApplication.class, args);
	}

}
