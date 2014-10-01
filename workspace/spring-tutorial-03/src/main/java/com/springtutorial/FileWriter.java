package com.springtutorial;

public class FileWriter implements LogWriter {

	public void write(String msg) {
		System.out.println("FILE> " + msg);
	}
}
