package com.springtutorial;

public class Animal {
	private final String type;
	private final String name;

	public Animal(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + "]";
	}

}
