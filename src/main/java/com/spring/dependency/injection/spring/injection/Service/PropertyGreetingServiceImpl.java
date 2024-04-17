package com.spring.dependency.injection.spring.injection.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("propertyInjected")
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Property injection is not recommended";
    }
}
