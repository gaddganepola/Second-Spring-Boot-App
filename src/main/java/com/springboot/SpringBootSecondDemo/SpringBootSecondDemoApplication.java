package com.springboot.SpringBootSecondDemo;

import com.springboot.SpringBootSecondDemo.model.Alien;
import com.springboot.SpringBootSecondDemo.model.Laptop;
import com.springboot.SpringBootSecondDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootSecondDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootSecondDemoApplication.class, args);

//		Alien alien = context.getBean(Alien.class);
//		alien.code();
//		System.out.println("Age: " + alien.getAge());

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}
}
