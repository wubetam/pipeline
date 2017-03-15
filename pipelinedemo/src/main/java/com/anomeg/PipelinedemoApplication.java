package com.anomeg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = { 
        org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class 
    })

@RestController
public class PipelinedemoApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello another update";
	}

	public static void main(String[] args) {
		SpringApplication.run(PipelinedemoApplication.class, args);
	}
}
