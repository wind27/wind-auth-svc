package com.wind.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

@PropertySource("classpath:dubbo.properties")
@MapperScan(basePackages = {"com.wind.auth.mapper"})
@ImportResource(locations={"classpath:spring/applicationContext-*.xml"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
