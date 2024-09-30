package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//모델맵퍼는 공통 config에 선언하기
@Configuration
public class MapperConfig {

  @Bean
  public ModelMapper modelMapper() {

      return new ModelMapper();
  }
}
