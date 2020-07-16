package ng.com.bitsystems.didemo;

import ng.com.bitsystems.didemo.controllers.SetterInjectedController;
import ng.com.bitsystems.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @BeforeAll
    public void setup() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testSetterInjectedController() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO,this.setterInjectedController.sayHello());
    }
}
