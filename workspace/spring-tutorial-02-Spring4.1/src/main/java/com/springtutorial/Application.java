package com.springtutorial;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		try {
			ctx = new AnnotationConfigApplicationContext(Application.class);
			FruitBasket basket = ctx.getBean(FruitBasket.class);
			System.out.println(basket);
		} finally {
			if (ctx != null && ctx instanceof ConfigurableApplicationContext) {
				ConfigurableApplicationContext configCtx = (ConfigurableApplicationContext) ctx;
				configCtx.close();
			}
		}
	}

	@Bean
	public FruitBasket getFruitBasket() {
		return new FruitBasket("Zoli's basket", Arrays.asList("apple", "pear", "orange"));
	}
}
