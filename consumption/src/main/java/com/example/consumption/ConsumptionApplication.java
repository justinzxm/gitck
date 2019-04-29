package com.example.consumption;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class ConsumptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumptionApplication.class, args);
	}

}
