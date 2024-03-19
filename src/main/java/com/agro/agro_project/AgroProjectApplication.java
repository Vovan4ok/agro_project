package com.agro.agro_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.agro.agro_project")
public class AgroProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroProjectApplication.class, args);
	}
}
