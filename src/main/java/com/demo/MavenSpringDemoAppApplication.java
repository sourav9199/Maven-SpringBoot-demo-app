package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class MavenSpringDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringDemoAppApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String Hello() {
		return "Hello world this is a maven app";
		
	}

}
