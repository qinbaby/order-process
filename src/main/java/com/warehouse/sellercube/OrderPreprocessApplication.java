package com.warehouse.sellercube;

import com.warehouse.sellercube.interceptor.AuthHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class OrderPreprocessApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(OrderPreprocessApplication.class, args);
	}

	@Autowired
	AuthHandlerInterceptor authHandlerInterceptor;

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authHandlerInterceptor)
				.addPathPatterns("/chenjing");
	}
}
