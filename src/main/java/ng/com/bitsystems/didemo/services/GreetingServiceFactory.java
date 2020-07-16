package ng.com.bitsystems.didemo.services;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new GermanPrimaryGreetingService(greetingRepository);
            case "es":
                return new SpanishPrimaryGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }

    }
}
