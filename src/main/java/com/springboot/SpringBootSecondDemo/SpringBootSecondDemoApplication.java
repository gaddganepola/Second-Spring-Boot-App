package com.springboot.SpringBootSecondDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootSecondDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootSecondDemoApplication.class, args);

		Alien alien = context.getBean(Alien.class);
		alien.code();
		System.out.println("Age: " + alien.getAge());
	}
}
