package ng.com.bitsystems.didemo.services;

public class PrimaryGreetingService implements GreetingService {

    GreetingRepository repository;

    public PrimaryGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return repository.getEnglishGreeting();
    }
}
