package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleCoreApplication.class, args);
		System.out.println("module-core 서버기동!!!");
	}

}
