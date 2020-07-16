package ng.com.bitsystems.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO="Hello Javarians";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
