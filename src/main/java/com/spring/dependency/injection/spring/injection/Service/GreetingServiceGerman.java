package com.spring.dependency.injection.spring.injection.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("GM")
@Service("i18n")
public class GreetingServiceGerman implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Say holla";
    }
}
