package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		args = new String[]{"--spring.config.location=http://172.16.0.181:8083/config/getConfig.properties/my-monkey/1.0/1.0/.properties"};
		SpringApplication.run(DemoApplication.class, args);


	}

}
