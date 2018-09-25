package com.szhqfy.gov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SzhqfyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SzhqfyApplication.class, args);
	}
}
