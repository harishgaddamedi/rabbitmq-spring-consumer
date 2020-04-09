package org.restlesscode.rabbit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RabbitExampleApp {

	public static void main(String[] args) {
		System.out.println("Main method started....");
		if (args.length == 0) {
			System.out.println("No arguments passed");
			return;
		}
		if (args[0].equals("-c")) {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-consumer-config.xml");
		}
	}

}
