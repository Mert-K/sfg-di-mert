package guru.springframework.sfg_di_mert.services;

import guru.springframework.sfg_di_mert.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService{
    private final EnglishGreetingRepository englishGreetingRepository;
    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository){
        this.englishGreetingRepository=englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
