package com.springtutorial;

public class Logger {
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;

	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}

	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public FileWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	@Override
	public String toString() {
		return "Logger [consoleWriter=" + consoleWriter + ", fileWriter="
				+ fileWriter + "]";
	}
}
