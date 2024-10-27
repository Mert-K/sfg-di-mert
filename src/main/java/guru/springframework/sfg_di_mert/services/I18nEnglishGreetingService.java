package guru.springframework.sfg_di_mert.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("EN")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
