package guru.springframework.sfg_di_mert.controllers;

import guru.springframework.sfg_di_mert.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
       return greetingService.sayGreeting();
    }

}
