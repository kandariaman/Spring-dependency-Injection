package com.spring.dependency.injection.spring.injection.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, this is my greeting";
    }
}
