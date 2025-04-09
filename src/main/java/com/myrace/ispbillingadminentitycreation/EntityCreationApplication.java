package com.myrace.ispbillingadminentitycreation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.TimeZone;

@SpringBootApplication
@EnableJpaAuditing
public class EntityCreationApplication {

	public static void main(String[] args) {
//		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		SpringApplication.run(EntityCreationApplication.class, args);
	}

}
