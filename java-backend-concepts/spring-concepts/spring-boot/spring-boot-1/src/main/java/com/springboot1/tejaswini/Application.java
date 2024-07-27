package com.springboot1.tejaswini;

import com.springboot1.tejaswini.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Alien obj1 = context.getBean(Alien.class);
		obj1.code();
	}

}
