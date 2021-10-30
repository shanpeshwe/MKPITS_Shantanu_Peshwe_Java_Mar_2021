package com.mkpits.cablecms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.mkpits.cablecms")
@ComponentScan(basePackages="com.mkpits.cablecms")
@EntityScan
@EnableJpaRepositories(basePackages="com.mkpits.cablecms.dao")
public class CablecmsApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CablecmsApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(CablecmsApplication.class);
	}
}
