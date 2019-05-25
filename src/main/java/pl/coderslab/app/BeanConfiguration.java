package pl.coderslab.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.Captain;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.Ship;

@Configuration
public class BeanConfiguration {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean
    public Captain jackSparrow() {
        return new Captain();
    }

    @Bean
    public Ship blackPearl(Captain captain) {
        return new Ship(captain);

        // można zrobić tak (ale tylko gdy metoda jackSparrow jest w tej samej klasie)
        // return new Ship(jackSparrow());

        // tak nie można!
        // return new Ship(new Captain());
    }

}
