package com.spring.dependency.injection.spring.injection.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18n")
public class GreetingServiceSpanish implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Guten tag";
    }
}
