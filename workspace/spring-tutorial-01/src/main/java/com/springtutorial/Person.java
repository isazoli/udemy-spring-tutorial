package com.springtutorial;

public class Person {
	private final int id;
	private final String name;
	private int taxId;
	private Address address;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static Person getInstance(int id, String name) {
		System.out.println("@create Person via factory-method");
		return new Person(id, name);
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void speak() {
		System.out.println("Person => Hello");
	}

	public void init() {
		System.out.println("@init " + this);
	}

	public void destroy() {
		System.out.println("@destroy " + this);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}
}
