package ng.com.bitsystems.didemo.config;

import ng.com.bitsystems.didemo.examplebean.FakeDataSource;
import ng.com.bitsystems.didemo.examplebean.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")})
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${bitsystems.user}")
    String user;

    @Value("{bisystems.password}")
    String password;

    @Value("${bitsystems.dburl}")
    String dburl;

    @Value("{jms.username}")
    String jmsUser;

    @Value("jms.password")
    String jmsPassword;

    @Value("jms.Url")
    String jmsUrl;

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        fakeJmsBroker.setUser(jmsUser);
        return fakeJmsBroker;
    }

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setDburl(dburl);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUser(environment.getProperty("USERNAME"));
        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
