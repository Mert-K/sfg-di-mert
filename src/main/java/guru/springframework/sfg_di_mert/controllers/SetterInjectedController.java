package guru.springframework.sfg_di_mert.controllers;

import guru.springframework.sfg_di_mert.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
