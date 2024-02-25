package com.openheptagon.springbootviamaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootViaMavenApplication {

	public static void main(String[] args) {
		System.out.println("Program started.");
		System.out.println("args are: " + args);
		SpringApplication.run(SpringBootViaMavenApplication.class, args);
		System.out.println("Program finished.");
	}

}
