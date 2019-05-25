package pl.coderslab.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.coderslab.beans.*;

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

    @Bean @Scope("prototype")
    public ScopePrototype scopePrototype() {
        return new ScopePrototype();
    }

    @Bean // singleton by default
    public ScopeSingleton scopeSingleton() {
        return new ScopeSingleton();
    }
}
