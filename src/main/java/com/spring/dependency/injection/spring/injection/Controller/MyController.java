package com.spring.dependency.injection.spring.injection.Controller;

import com.spring.dependency.injection.spring.injection.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Qualifier("i18n")
    @Autowired
    GreetingService greetingService;

//    public MyController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
