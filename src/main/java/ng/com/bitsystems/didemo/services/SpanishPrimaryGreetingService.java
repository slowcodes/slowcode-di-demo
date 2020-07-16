package ng.com.bitsystems.didemo.services;


public class SpanishPrimaryGreetingService implements GreetingService{

    GreetingRepository greetingRepository;

    public SpanishPrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
