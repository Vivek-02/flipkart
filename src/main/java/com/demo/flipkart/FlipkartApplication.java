package com.demo.flipkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlipkartApplication {

	public static void main(String[] args) {
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OrderConfig.class);
		OrderController orderController = context.getBean("orderControllerBean", OrderController.class);
		orderController.test();*/
		SpringApplication.run(FlipkartApplication.class, args);
	}


	/*@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Hello");
		};
	}*/
}
