package ng.com.bitsystems.didemo;

import ng.com.bitsystems.didemo.controllers.ConstructorInjectedController;
import ng.com.bitsystems.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeAll
    public void setup() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testControllerInjectedController(){
        assertEquals(GreetingServiceImpl.HELLO,this.constructorInjectedController.sayHello());
    }
}
