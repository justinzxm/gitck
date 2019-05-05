package com.example.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
		System.out.println("master");
		System.out.println("master1");
		System.out.println("master2");
		SpringApplication.run(Test1Application.class, args);
	}

}
