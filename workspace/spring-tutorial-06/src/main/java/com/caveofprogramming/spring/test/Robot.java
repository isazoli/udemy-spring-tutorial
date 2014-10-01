package com.caveofprogramming.spring.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	private @Value("1234") int id = 0;
	private @Value("Bello") String speach = "Hello";

	public void speak() {
		System.out.println(id + " : " + speach);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpeach() {
		return speach;
	}

	public void setSpeach(String speach) {
		this.speach = speach;
	}
}
