package com.example.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
		System.out.println("master");
		System.out.println("master1");
		System.out.println("master2");
		System.out.println("master3");
		System.out.println("master4");
		System.out.println("master_next1_child1");
		SpringApplication.run(Test1Application.class, args);
	}

}
