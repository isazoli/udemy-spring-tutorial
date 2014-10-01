package com.springtutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = null;
		try {
			ctx = new ClassPathXmlApplicationContext("com/springtutorial/beans/beans.xml");
			FruitBasket basket = (FruitBasket) ctx.getBean("basket");
			System.out.println(basket);
			Jungle jungle = ctx.getBean(Jungle.class);
			System.out.println(jungle);
		} finally {
			if (ctx != null)
				ctx.close();
		}
	}
}
