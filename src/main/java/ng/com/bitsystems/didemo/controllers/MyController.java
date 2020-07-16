package ng.com.bitsystems.didemo.controllers;


import ng.com.bitsystems.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){

        return greetingService.sayGreeting();
    }
}
