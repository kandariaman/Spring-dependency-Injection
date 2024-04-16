package com.spring.dependency.injection.spring.injection;

import com.spring.dependency.injection.spring.injection.Controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main Method");
		System.out.println(controller.sayHello());
	}

}
