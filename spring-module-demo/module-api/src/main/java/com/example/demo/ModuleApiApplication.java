package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo.*") // 모든 패키지 스캔 후 Bean 등록
//@MapperScan(basePackages  = "com.example.demo.mapper") // 패키지내의 모든 매퍼 인터페이스를 스캔하고 MyBatis의 매퍼로 인식
public class ModuleApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ModuleApiApplication.class, args);
	}

}
