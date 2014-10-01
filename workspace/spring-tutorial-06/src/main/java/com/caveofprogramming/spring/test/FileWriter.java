package com.caveofprogramming.spring.test;

import org.springframework.stereotype.Component;

@Component(value = "fileWriter")
public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("Write to file: " + text);
	}

}
