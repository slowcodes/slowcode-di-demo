package ng.com.bitsystems.didemo;

import ng.com.bitsystems.didemo.controllers.MyController;
import ng.com.bitsystems.didemo.examplebean.FakeDataSource;
import ng.com.bitsystems.didemo.examplebean.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
        System.out.println("Username: "+fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);
        System.out.println("JMS User: "+fakeJmsBroker.getUser());
    }

}
