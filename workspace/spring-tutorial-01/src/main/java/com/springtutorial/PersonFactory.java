package com.springtutorial;

public class PersonFactory {

	public Person createPerson(int id, String name) {
		System.out.println("@create Person via " + this);
		return new Person(id, name);
	}

	@Override
	public String toString() {
		return "PersonFactory []";
	}
}
