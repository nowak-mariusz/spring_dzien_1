package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageService;

public class SpringDiApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = context.getBean("jakas_unikalna_nazwa", HelloWorld.class);
        helloWorld.getMessage();

        context.close();
    }
}
