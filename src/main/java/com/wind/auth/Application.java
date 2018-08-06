package com.wind.auth;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication

@MapperScan("com.wind.auth.mapper")
@DubboComponentScan(basePackages = "com.wind.auth.service.impl")

@ImportResource(locations={"classpath:spring/applicationContext-*.xml"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
