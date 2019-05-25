package pl.coderslab.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.HelloWorld;

@Configuration
public class BeanConfiguration {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

}
