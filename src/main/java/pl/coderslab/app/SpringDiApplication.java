package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfiguration.class);

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.hello();

        context.close();
    }
}
