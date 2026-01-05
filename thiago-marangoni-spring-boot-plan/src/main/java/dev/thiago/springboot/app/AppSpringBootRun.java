package dev.thiago.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "dev.thiago.springboot.*")
public class AppSpringBootRun {

	public static void main(String[] args) {
		SpringApplication.run(AppSpringBootRun.class, args);
	}

}
