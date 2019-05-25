package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfiguration.class);

        // wstaje pusty kontekst

        context.close();
    }
}
