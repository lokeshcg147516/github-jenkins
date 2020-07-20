package com.cg.ms.capgeminimicroservcs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@Value("${demo}")
	String demo2;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return demo2;
	}
}
