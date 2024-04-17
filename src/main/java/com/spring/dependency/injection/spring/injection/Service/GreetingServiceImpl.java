package com.spring.dependency.injection.spring.injection.Service;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, this is my greeting";
    }
}
