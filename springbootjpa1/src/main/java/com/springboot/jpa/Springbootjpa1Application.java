package com.springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.jpa.entities.User;
import com.springboot.jpa.repo.UserRespository;

@SpringBootApplication
public class Springbootjpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Springbootjpa1Application.class, args);
		UserRespository userrepo = context.getBean(UserRespository.class);
		User user=new User();
		user.setName("Ayush");
		user.setCity("orai");
		user.setStatus("java programmer");
		
	User save = userrepo.save(user);
	System.out.println(save);
	}
	}


