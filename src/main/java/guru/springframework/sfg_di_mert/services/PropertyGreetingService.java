package guru.springframework.sfg_di_mert.services;

public class PropertyGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
