package dev.thiago.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "dev.thiago.springboot.*")
@EntityScan(basePackages = { "dev.thiago.springboot.model" })
@ComponentScan(basePackages = { "dev.thiago.*" })
@EnableJpaRepositories(basePackages = { "dev.thiago.springboot.repository" })
public class AppSpringBootRun {

	public static void main(String[] args) {
		SpringApplication.run(AppSpringBootRun.class, args);
	}

}
