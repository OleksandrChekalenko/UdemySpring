package main.entryPoint;

import main.config.ApplicationContextConfig;
import main.person.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
/*
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();*/

        /*Pet pet = context.getBean("catBean", Pet.class);
        pet.say();*/

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());

        context.close();
    }
}
