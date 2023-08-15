package com.cicd.cicdappliedtospringbootjavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping; 

@SpringBootApplication
public class CicdAppliedToSpringBootJavaAppApplication {
   
	@GetMapping("/welcome")
	public String getMesg() {
    	return "Welcome to CI/CD !!!..";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(CicdAppliedToSpringBootJavaAppApplication.class, args);
	}

}
