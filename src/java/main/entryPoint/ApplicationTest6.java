package main.entryPoint;

import main.animals.Cat;
import main.animals.Pet;
import main.config.XXConfiguration;
import main.person.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(XXConfiguration.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
