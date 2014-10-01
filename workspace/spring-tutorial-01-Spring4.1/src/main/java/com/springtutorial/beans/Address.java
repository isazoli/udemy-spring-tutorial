package com.springtutorial.beans;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	private final String street;
	private final String postalCode;

	public Address(@Value("Elm Street 666") String street, @Value("6789") String postalCode) {
		this.street = street;
		this.postalCode = postalCode;
	}

	public void init() {
		System.out.println("@init " + this);
	}

	public void destroy() {
		System.out.println("@destroy " + this);
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postalCode=" + postalCode + "]";
	}
}
