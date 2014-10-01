package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springtutorial.beans.Address;
import com.springtutorial.beans.Person;

@Configuration
@ComponentScan
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		try {
			ctx = new AnnotationConfigApplicationContext(Application.class);
			Person person1 = ctx.getBean(Person.class);
			person1.setTaxId(9999);
			Person person2 = ctx.getBean(Person.class);
			System.out.println(person2);
			person2.speak();
		} finally {
			if (ctx != null && ctx instanceof ConfigurableApplicationContext) {
				ConfigurableApplicationContext configCtx = (ConfigurableApplicationContext) ctx;
				configCtx.close();
			}
		}
	}

//	@Bean
//	@Scope("singleton")
//	public Person getPerson() {
//		return new Person(111, "Yani");
//	}

	@Bean(initMethod="init", destroyMethod="destroy")
	public Address getAddress() {
		return new Address("Elm Street 666", "6789");
	}
}
