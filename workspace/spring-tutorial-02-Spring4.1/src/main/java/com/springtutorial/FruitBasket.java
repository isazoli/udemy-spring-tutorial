package com.springtutorial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//@Configuration
public class FruitBasket {
	private String name;
	private List<String> fruits;

	public FruitBasket(String name, List<String> fruits) {
		this.name = name;
		this.fruits = fruits;
	}
	
//	@Bean
//	public FruitBasket getInstance() {
//		return new FruitBasket("Zoli's basket", new ArrayList<String>());
//	}

	@Override
	public String toString() {
		return "FruitBasket [name=" + name + ", fruits=" + fruits + "]";
	}
}
