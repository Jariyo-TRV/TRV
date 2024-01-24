package com.ssafy.jariyo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JariyoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JariyoApplication.class, args);
	}

}
