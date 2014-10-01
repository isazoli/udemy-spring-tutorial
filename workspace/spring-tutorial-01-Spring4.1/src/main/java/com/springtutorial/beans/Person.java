package com.springtutorial.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Person {
	private final int id;
	private final String name;
	private @Value("222")
	int taxId;
	@Autowired
	private Address address;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public int getTaxId() {
		return taxId;
	}

	public void speak() {
		System.out.println("Hello @Spring 4.1.0");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("@init " + this);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("@destroy " + this);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}
}
