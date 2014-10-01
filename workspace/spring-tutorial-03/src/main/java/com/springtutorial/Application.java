package com.springtutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = null;
		try {
			ctx = new ClassPathXmlApplicationContext("com/springtutorial/beans/beans.xml");
			Logger logger = ctx.getBean(Logger.class);
			System.out.println(logger);
		} finally {
			if (ctx != null)
				ctx.close();
		}
	}
}
