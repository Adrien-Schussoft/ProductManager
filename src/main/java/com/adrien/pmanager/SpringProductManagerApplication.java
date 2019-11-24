package com.adrien.pmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"controller"})
public class SpringProductManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductManagerApplication.class, args);
	}
	
}

