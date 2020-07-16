package ng.com.bitsystems.didemo.config;

import ng.com.bitsystems.didemo.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"en","default"})
    PrimaryGreetingService primaryGreetingService(GreetingRepository greetingRepository){
        return new PrimaryGreetingService(greetingRepository);
    }

    @Bean
    @Profile("es")
    @Primary
    SpanishPrimaryGreetingService spanishPrimaryGreetingService(GreetingRepository greetingRepository){
        return new SpanishPrimaryGreetingService(greetingRepository);
    }

    @Bean
    @Profile("de")
    @Primary
    GermanPrimaryGreetingService germanPrimaryGreetingService(GreetingRepository greetingRepository){
        return new GermanPrimaryGreetingService(greetingRepository);
    }
}
