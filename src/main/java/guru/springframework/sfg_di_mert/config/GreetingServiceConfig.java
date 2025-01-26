package guru.springframework.sfg_di_mert.config;

import guru.springframework.sfg_di_mert.services.ConstructorGreetingService;
import guru.springframework.sfg_di_mert.services.PropertyGreetingService;
import guru.springframework.sfg_di_mert.services.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }

    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }
}
