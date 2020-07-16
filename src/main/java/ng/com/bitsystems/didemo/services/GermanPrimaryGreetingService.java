package ng.com.bitsystems.didemo.services;

public class GermanPrimaryGreetingService implements GreetingService{

    GreetingRepository greetingRepository;

    public GermanPrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
