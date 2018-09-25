package com.szhqfy.gov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

	public ServletInitializer(){
		super();
		setRegisterErrorPageFilter(false);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SzhqfyApplication.class);
	}



	public static void main(String[] args) {
		SpringApplication.run(SzhqfyApplication.class, args);
	}
}
