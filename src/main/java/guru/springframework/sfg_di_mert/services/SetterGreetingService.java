package guru.springframework.sfg_di_mert.services;


public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
