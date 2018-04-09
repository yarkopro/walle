package com.yarkopro.walle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class WallEApplication {

	public static void main(String[] args) {
		SpringApplication.run(WallEApplication.class, args);
	}
}

