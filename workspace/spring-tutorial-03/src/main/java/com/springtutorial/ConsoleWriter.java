package com.springtutorial;

public class ConsoleWriter implements LogWriter {

	public void write(String msg) {
		System.out.println("CONSOLE> " + msg);
	}
}
