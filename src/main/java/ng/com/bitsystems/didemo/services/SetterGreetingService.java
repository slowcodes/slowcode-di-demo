package ng.com.bitsystems.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Getting from setter greetings service";
    }
}
