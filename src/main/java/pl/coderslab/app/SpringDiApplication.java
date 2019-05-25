package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageService;

public class SpringDiApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        HelloWorld mariusz = context.getBean("mariusz", HelloWorld.class);
//        mariusz.getMessage();
//
//        MessageService msgService = context.getBean("msgService", MessageService.class);
//        msgService.send();

        context.close();
    }
}
