package com.spring.dependency.injection.spring.injection.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplSecond implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hey there Sayonara";
    }
}
