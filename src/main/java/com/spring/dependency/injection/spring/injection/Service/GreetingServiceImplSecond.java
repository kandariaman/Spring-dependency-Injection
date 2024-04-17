package com.spring.dependency.injection.spring.injection.Service;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImplSecond implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hey there Sayonara";
    }
}
