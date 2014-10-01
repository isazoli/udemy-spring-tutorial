package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/caveofprogramming/spring/test/beans/beans.xml");

		Logger logger = (Logger) ctx.getBean("logger");

		logger.writeConsole("Hello there");
		logger.writeFile("Hi again");

		Robot robot = ctx.getBean(Robot.class);
		robot.speak();
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
