package com.springtutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = null;
		try {
			ctx = new ClassPathXmlApplicationContext("com/springtutorial/beans/beans.xml");
			Person person = (Person) ctx.getBean("person");
			person.speak();
			System.out.println(person);
			Person person2 = (Person) ctx.getBean("person");
			System.out.println(person2);
			Address address2 = (Address) ctx.getBean("address2");
			System.out.println(address2);
		} finally {
			if (ctx != null)
				ctx.close();
		}
	}
}
