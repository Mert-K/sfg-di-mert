package guru.springframework.sfg_di_mert.services;

import org.springframework.stereotype.Service;


public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
