package com.springtutorial.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonFactory {
	@Bean
	@Scope("singleton")
	public Person getPerson() {
		System.out.println("@create Person via " + this);
		return new Person(123, "Yani");
	}

	@Override
	public String toString() {
		return "PersonFactory";
	}
}
