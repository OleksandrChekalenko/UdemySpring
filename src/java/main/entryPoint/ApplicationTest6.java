package main.entryPoint;

import main.animals.Pet;
import main.config.XXConfiguration;
import main.person.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(XXConfiguration.class);
/*
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();*/

        /*Pet pet = context.getBean("catBean", Pet.class);
        pet.say();*/

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}
