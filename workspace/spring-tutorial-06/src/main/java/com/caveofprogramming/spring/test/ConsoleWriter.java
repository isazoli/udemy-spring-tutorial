package com.caveofprogramming.spring.test;

import org.springframework.stereotype.Component;

@Component(value = "consoleWriter")
public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}

}
