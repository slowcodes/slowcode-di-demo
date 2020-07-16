package ng.com.bitsystems.didemo;

import ng.com.bitsystems.didemo.controllers.PropertyInjectedController;
import ng.com.bitsystems.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeAll
    public void setup() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreetingsService() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
