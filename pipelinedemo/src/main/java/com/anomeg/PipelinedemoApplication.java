package com.anomeg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.anomeg.javaconfig.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class }, scanBasePackages = {
				"com.anomeg" })
public class PipelinedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipelinedemoApplication.class, args);
	}

}
