package com.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages="com.springboot")
@EnableJpaRepositories("com.springboot.repository")
@EntityScan("com.springboot.model")
@EnableJpaAuditing
public class ApplicationConfiguration {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
}
