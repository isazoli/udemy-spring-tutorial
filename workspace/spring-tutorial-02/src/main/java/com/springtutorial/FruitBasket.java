package com.springtutorial;

import java.util.List;

public class FruitBasket {
	private String name;
	private List<String> fruits;

	public FruitBasket(String name, List<String> fruits) {
		this.name = name;
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		return "FruitBasket [name=" + name + ", fruits=" + fruits + "]";
	}
}
